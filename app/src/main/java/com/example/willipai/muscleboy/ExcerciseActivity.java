package com.example.willipai.muscleboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Date;

import static com.example.willipai.muscleboy.MainActivity.excercisesList;

public class ExcerciseActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    static ArrayAdapter<Excercise> excercisesData;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);
        submitButton = (Button) findViewById(R.id.button5);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log l = new Log();
                l.date = new Date();
                l.muscleGrp = UserPreference.userPreference;
                /*left to code*/
            }
        });
        filterExcercises();

    }

    public void filterExcercises()
    {
        excercisesData = new ArrayAdapter<Excercise>(getApplicationContext(), R.layout.adapater_aid_kalpan, R.id.textView4);
        int nTotalExcerises;
        int nExcercises;
        int temp;
        String temp2;
        Excercise currentExcercise;
        Spinner view;

        nTotalExcerises = excercisesList.size();
        for (int i = 0; i < nTotalExcerises; i++)
        {
            currentExcercise = excercisesList.get(i);
            temp = currentExcercise.muscleGroups.length;
            temp2 = UserPreference.userPreference;

            for (int j = 0; j < temp; j++)
            {
                if (currentExcercise.muscleGroups[j].equals(temp2))
                {
                    excercisesData.add(currentExcercise);
                    break;
                }
            }

        }

        view = (Spinner) findViewById(R.id.spinner2);
        view.setAdapter(excercisesData);
    }

    public void onItemSelected(AdapterView parent, View view, int position, long id)
    {

    }
    public void onNothingSelected(AdapterView parent)
    {

    }

}
