package com.example.willipai.muscleboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Date;

import static com.example.willipai.muscleboy.MainActivity.muscleGrpsList;

public class ExcerciseActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    static ArrayAdapter<String> excercises;
    static MuscleGrp m;

    static Spinner view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button submitButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);
        submitButton = (Button) findViewById(R.id.button5);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log l = new Log();
                l.date = new Date();
                l.muscleGrp = UserPreference.userPreference;
                //l.excercise = view.
                /*left to code*/
            }
        });
        filterExcercises();

    }

    public void filterExcercises()
    {
        excercises = new ArrayAdapter<String>(getApplicationContext(), R.layout.adapater_aid_kalpan, R.id.textView4);
        for(int i = 0; i < muscleGrpsList.size(); i++)
            {
                if((muscleGrpsList.get(i).toString()).equals(UserPreference.userPreference))
                {
                    m = muscleGrpsList.get(i);
                    break;
                }
            }
        if(m != null && m.excercies != null)
        {
            for(int i = 0; i < m.excercies.length; i++)
            {

                excercises.add(m.excercies[i]);

            }
        }

        view = (Spinner) findViewById(R.id.spinner2);
        view.setAdapter(excercises);
    }

    public void onItemSelected(AdapterView parent, View view, int position, long id)
    {

    }
    public void onNothingSelected(AdapterView parent)
    {

    }

}
