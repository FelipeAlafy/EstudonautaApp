package com.felipealafy.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class ActivityMidia extends AppCompatActivity {

    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);
        video = findViewById(R.id.video);

        //Confingurando o caminho do vídeo, e convertendo o mesmo para Uri.
        String cam = "android.resource://com.felipealafy.estudonautaapp/" + R.raw.estudonauta;
        Uri arq = Uri.parse(cam);

        //Colocando o vídeo e iniciando o mesmo.
        video.setVideoURI(arq);
        video.start();
    }

    public void back(View view) {
        finish();
    }
}