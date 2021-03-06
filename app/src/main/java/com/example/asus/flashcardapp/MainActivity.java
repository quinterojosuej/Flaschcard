package com.example.asus.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.cardQuestion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.cardAnswer).setVisibility(View.VISIBLE);
                findViewById(R.id.cardQuestion).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.cardAnswer).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                findViewById(R.id.cardAnswer).setVisibility(View.INVISIBLE);
                findViewById(R.id.cardQuestion).setVisibility(View.VISIBLE);
            }
        });

    }
}
