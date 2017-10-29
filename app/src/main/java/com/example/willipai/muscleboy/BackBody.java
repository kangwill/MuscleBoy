package com.example.willipai.muscleboy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.example.willipai.muscleboy.R.id.abs1;
import static com.example.willipai.muscleboy.R.id.back;
import static com.example.willipai.muscleboy.R.id.calves;
import static com.example.willipai.muscleboy.R.id.chest1;
import static com.example.willipai.muscleboy.R.id.glutes;
import static com.example.willipai.muscleboy.R.id.hamstrings;
import static com.example.willipai.muscleboy.R.id.infraspinatus;
import static com.example.willipai.muscleboy.R.id.lowerback;
import static com.example.willipai.muscleboy.R.id.middleback;
import static com.example.willipai.muscleboy.R.id.right_bicep;
import static com.example.willipai.muscleboy.R.id.right_deltoid;
import static com.example.willipai.muscleboy.R.id.right_forearm;
import static com.example.willipai.muscleboy.R.id.right_oblique;
import static com.example.willipai.muscleboy.R.id.right_quad;
import static com.example.willipai.muscleboy.R.id.text;
import static com.example.willipai.muscleboy.R.id.tibs;
import static com.example.willipai.muscleboy.R.id.triceps;
import static com.example.willipai.muscleboy.R.id.upperback;

public class BackBody extends Activity {

    private static SeekBar seek_bar;
    private static TextView text_view;
    public Button frontView;
    private Button workout;
    static int progress_val;

    public void init() {
        frontView = (Button) findViewById(R.id.button4);
        frontView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BackBody.this, Body.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }

    public void magicLamp(){

        text_view = (TextView)findViewById(R.id.textView4);
        text_view.setText("Move me");
        seek_bar = (SeekBar)findViewById(R.id.seekBar2);
        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_val = progress;
                        if(progress_val > 0 && progress_val < 15){
                            text_view.setText("Calf");
                        }
                        if(progress_val > 14 && progress_val < 29){
                            text_view.setText("Glute");
                        }
                        if(progress_val > 28 && progress_val < 44){
                            text_view.setText("Hamstring");
                        }
                        if(progress_val > 43 && progress_val < 58){
                            text_view.setText("Infraspinatus");
                        }
                        if(progress_val > 55 && progress_val < 72){
                            text_view.setText("Lowerback");
                        }
                        if(progress_val > 67 && progress_val < 85){
                            text_view.setText("MiddleBack");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("Tricep");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("UpperBack");
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(progress_val > 0 && progress_val < 15){
                            text_view.setText("Calf");
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            Intent intent = new Intent(BackBody.this, Calf.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                        if(progress_val > 14 && progress_val < 29){
                            text_view.setText("Glute");
                        }
                        if(progress_val > 28 && progress_val < 44){
                            text_view.setText("Hamstring");
                        }
                        if(progress_val > 43 && progress_val < 58){
                            text_view.setText("Infraspinatus");
                        }
                        if(progress_val > 55 && progress_val < 72){
                            text_view.setText("Lowerback");
                        }
                        if(progress_val > 67 && progress_val < 85){
                            text_view.setText("MiddleBack");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("Tricep");
                        }
                        if(progress_val > 89 && progress_val < 101){
                            text_view.setText("UpperBack");
                        }
                    }
                }
        );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_back_body);
        magicLamp();
        init();
        }
}
