package com.example.tocarmidias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
private MediaPlayer musicas;

private SeekBar controlVol;

private AudioManager audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarSeekBar();


         musicas = MediaPlayer.create(this, R.raw.musicanova);

    }

        public void tocarMusica (View view){
            if (musicas != null){
                musicas.start();
            }

        }

        public void pauseMusica(View view){
            if (musicas.isPlaying()){
                musicas.pause();
            }
        }
        public void pararMusica(View view){
    if (musicas.isPlaying()){
        musicas.stop();
        musicas = MediaPlayer.create(this, R.raw.teste);

    }
        }

        public void inicializarSeekBar(){
        controlVol = findViewById(R.id.controlVol);
        audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int controlVolMax = audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int controlVolAtual = audio.getStreamVolume(audio.STREAM_MUSIC);
        controlVol.setMax(controlVolMax);
        controlVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audio.setStreamVolume(AudioManager.STREAM_MUSIC , progress, AudioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        }



}