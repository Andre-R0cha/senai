package com.example.prova.ui.midia;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prova.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MidiaplayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class MidiaplayFragment extends Fragment {

    private MediaPlayer play;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MidiaplayFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MidiaplayFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MidiaplayFragment newInstance(String param1, String param2) {
        MidiaplayFragment fragment = new MidiaplayFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
//        play = MediaPlayer.create(this, R.raw.music);
    }
//    public void tocarMusica (View view){
//        if (play!= null){
//            play.start();
//        }
//
//    }
//
//    public void pauseMusica(View view){
//        if (play.isPlaying()){
//          play.pause();
//        }
//    }
//    public void pararMusica(View view){
//        if (play.isPlaying()){
//            play.stop();
//            play = MediaPlayer.create(this, R.raw.music);
//
//        }
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_midia, container, false);
    }
}