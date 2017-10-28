package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    public Button bodyBut;

        public void init(){
            bodyBut = findViewById(R.id.bodyBut);
            bodyBut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent first = new Intent(MainActivity.this, Body.class);
                    startActivity(first);
                }
            });
        }

        //hi HAHAHAHHAa
	//no, this is Kalpan, howdy broasdas
    //nooooooooo
	//test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
    }
}
