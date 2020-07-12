/**
MIT License

Copyright (c) 2020 Gustavo Guanabara.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
*/
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
