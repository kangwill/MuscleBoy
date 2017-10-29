package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import java.util.Scanner;
import java.util.ArrayList;

public class MainActivity extends Activity {

    /*buttons*/
    public ImageButton bodyBut;
    public ImageButton journalButton;
    public ImageButton questionButton;
    public ImageButton settingsButton;
    public void init(){
        bodyBut = (ImageButton)findViewById(R.id.imageButton3);
        bodyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(MainActivity.this, Body.class);
                startActivity(first);
            }
        });
        journalButton = findViewById(R.id.imageButton);
        journalButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent journalIntent = new Intent(MainActivity.this, Journal.class);
                startActivity(journalIntent);
            }
        });
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
    }
}
