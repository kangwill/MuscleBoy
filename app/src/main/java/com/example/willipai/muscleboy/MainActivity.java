package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class MainActivity extends Activity {

    /*buttons*/
    public ImageButton bodyBut;
    public ImageButton journalButton;
    public Button questionButton;
    public ImageButton settingsButton;
    String nameExcercise;
    String wordStr;
    String[] muscleGroupData;
    String temp;
    ArrayList<Excercise> excercisesList;
    public void init()
    {
        excercisesList = new ArrayList<Excercise>();
        Scanner s;
        try
        {
            s = new Scanner(getResources().openRawResource(R.raw.rawexcerciseinput));
            if(s==null)
            {
                throw new IOException("File not opened");
            }
        }
        catch(IOException ioExceptionE)
        {
            System.exit(-1);
            return;
        }


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
        settingsButton = findViewById(R.id.imageButton2);
        settingsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent settingsActivity = new Intent(MainActivity.this, Setting.class);
                startActivity(settingsActivity);
            }
        });
        questionButton = findViewById(R.id.button2);
        questionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent questionsActivity = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(questionsActivity);
            }
        });
        while(s.hasNext())
        {
            nameExcercise = s.next();
            temp = s.nextLine();
            if(temp != null)
            {
                muscleGroupData = temp.split(" ");
                if(muscleGroupData != null && muscleGroupData.length != 0)
                {
                    excercisesList.add(new Excercise(nameExcercise, muscleGroupData));
                }
            }
        }
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
    }
}
