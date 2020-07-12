package com.felipealafy.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ActivityCursos extends AppCompatActivity {
    Intent nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }


    public void back(View view) {
        finish();
    }

    public void clickCursoPortugol(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/programacao-basica/"));
        startActivity(nav);
    }

    public void clickCursoLingC(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/linguagem-c/"));
        startActivity(nav);
    }

    public void clickCursoKotlin(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/kotlin/"));
        startActivity(nav);
    }

    public void clickCursoCursoLingCSharp(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/c/"));
        startActivity(nav);
    }

    public void clickCursoAndroid(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/android-studio/"));
        startActivity(nav);
    }

    public void clickCursoPHP(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/php-mysql/"));
        startActivity(nav);
    }

    public void clickCursoProdVideos(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/producao-de-videos/"));
        startActivity(nav);
    }
}