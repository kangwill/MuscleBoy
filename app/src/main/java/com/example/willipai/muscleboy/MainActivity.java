package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class MainActivity extends Activity {

    /*buttons*/
    public ImageButton bodyBut;
    public ImageButton journalButton;
    public Button questionButton;
    public ImageButton settingsButton;
    String nameExcercise;
    String[] muscleGroupData;
    String temp;
    ArrayList<Excercise> excercisesList;
    /*Next data item used elsewhere*/
    static int userCount;
    Date startingDay;
    Date today;
    public void init()
    {
        excercisesList = new ArrayList<Excercise>();
        Scanner s;
        /*possibly safer initialization*/
        s = null;
        try
        {
            s = new Scanner(getResources().openRawResource(R.raw.rawexcerciseinput));
        }
        catch(Resources.NotFoundException e)
        {
            //
        }


        bodyBut = findViewById(R.id.imageButton3);

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
                if(muscleGroupData.length != 0)
                {
                    excercisesList.add(new Excercise(nameExcercise, muscleGroupData));
                }
            }
        }
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        today = new Date();
        InputStream ins;
        ObjectInputStream ois;
        try
            {
                ins = getResources().openRawResource(R.raw.profilingdata);
                ois = new ObjectInputStream(ins);
                startingDay = (Date) ois.readObject();
                userCount = ois.readInt();
            }
        catch(Resources.NotFoundException e)
        {
            /*setting startingToday as today*/
            startingDay = today;
        }
        catch(IOException e)
        {
            startingDay = today;
            userCount = 0;
        }

        catch(ClassNotFoundException e)
        {startingDay = today;
        userCount = 0;
        }
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
    }
}
