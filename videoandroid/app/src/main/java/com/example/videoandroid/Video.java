package com.example.videoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        video = findViewById(R.id.videoView);


        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.R){
            WindowInsetsController insetsController= getWindow().getInsetsController();
            if(insetsController != null) {
                insetsController.hide(WindowInsetsCompat.Type.systemBars());
                insetsController.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);

            }
        }else{
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        }


        getSupportActionBar().hide();
//
//        View decorView = getWindow().getDecorView();
//        int uiOptions = VideoView.SYSTEM_UI_FLAG_FULLSCREEN;
//        decorView.setSystemUiVisibility(uiOptions);


        video.setMediaController(new MediaController(this));
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.video);
        video.start();
    }
}