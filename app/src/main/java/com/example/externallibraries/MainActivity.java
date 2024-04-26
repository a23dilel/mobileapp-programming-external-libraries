package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.myImageView);

        /*
        Licence information
        PSX-Console-wController.png by Evan-Amos used Public Domain
        */
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/9/95/PSX-Console-wController.png").into(imageView);

    }
}
