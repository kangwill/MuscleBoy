package com.example.willipai.muscleboy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Setting extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button submitButton;
        setContentView(R.layout.activity_setting);
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(getApplicationContext(), R.layout.adapater_aid_kalpan, R.id.textView4);
        arrayAdapter.addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
        spinner.setAdapter(arrayAdapter);
        submitButton = (Button) findViewById(R.id.submitButton1);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Object o = spinner.getSelectedItem();
                if(o != null)
                {
                    Integer n = (Integer) o;
                    MainActivity.userCount = n;
                    Intent goToMenu = new Intent(Setting.this, MainActivity.class);
                    startActivity(goToMenu);
                }

            }
        });
    }


    public void onItemSelected(AdapterView parent, View view, int position, long id)
        {

        }
        public void onNothingSelected(AdapterView parent)
        {

        }


}
