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

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent tela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCursos(View view) {
        tela = new Intent(getApplicationContext(), ActivityCursos.class);
        startActivity(tela);
    }

    public void clickTeam(View view) {
        tela = new Intent(getApplicationContext(), ActivityEquipe.class);
        startActivity(tela);
    }

    public void clickMidia(View view) {
        tela = new Intent(getApplicationContext(), ActivityMidia.class);
        startActivity(tela);
    }
}
