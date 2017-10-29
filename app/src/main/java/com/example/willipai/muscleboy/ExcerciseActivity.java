package com.example.willipai.muscleboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class ExcerciseActivity extends AppCompatActivity {
ArrayList<Excercise> excercisesData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);
        filterExcercises();
    }

    public void filterExcercises()
    {
        
    }
}
