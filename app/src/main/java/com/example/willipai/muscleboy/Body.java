package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.example.willipai.muscleboy.R.id.abs1;
import static com.example.willipai.muscleboy.R.id.chest1;
import static com.example.willipai.muscleboy.R.id.right_bicep;
import static com.example.willipai.muscleboy.R.id.right_deltoid;
import static com.example.willipai.muscleboy.R.id.right_forearm;
import static com.example.willipai.muscleboy.R.id.right_oblique;
import static com.example.willipai.muscleboy.R.id.right_quad;
import static com.example.willipai.muscleboy.R.id.tibs;

public class Body extends Activity{

    private static SeekBar seek_bar;
    private static TextView text_view;
    static int progress_val;
    private Button workout;
    public Button backView;

    public void init() {
        backView = (Button) findViewById(R.id.button3);
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Body.this, BackBody.class);// New activity
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }

    public void magicLamp(){
        text_view = (TextView)findViewById(R.id.textView7);
        text_view.setText("Move me");
        seek_bar = (SeekBar)findViewById(R.id.seekBar);
        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_val = progress;

                        if(progress_val > 0 && progress_val < 15){
                            text_view.setText("Deltoid");
                        }
                        if(progress_val > 14 && progress_val < 29){
                            text_view.setText("Chest");
                        }
                        if(progress_val > 28 && progress_val < 44){
                            text_view.setText("Bicep");
                        }
                        if(progress_val > 43 && progress_val < 58){
                            text_view.setText("Oblique");
                        }
                        if(progress_val > 55 && progress_val < 72){
                            text_view.setText("Ab");
                        }
                        if(progress_val > 67 && progress_val < 85){
                            text_view.setText("Forearm");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("Tib");
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(progress_val > 0 && progress_val < 15){
                            text_view.setText("Deltoid");

                        }
                        if(progress_val > 14 && progress_val < 29){
                            text_view.setText("Chest");
                        }
                        if(progress_val > 28 && progress_val < 44){
                            text_view.setText("Bicep");
                        }
                        if(progress_val > 43 && progress_val < 58){
                            text_view.setText("Oblique");
                        }
                        if(progress_val > 55 && progress_val < 72){
                            text_view.setText("Ab");
                        }
                        if(progress_val > 67 && progress_val < 85){
                            text_view.setText("Forearm");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("Tib");
                        }
                    }
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_body);
        magicLamp();
        init();
    }
}
