package com.example.willipai.muscleboy;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import static android.graphics.Color.WHITE;

public class Body extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        ImageView abs = (ImageView)findViewById(R.id.imageView55);
        abs.setColorFilter(WHITE, PorterDuff.Mode.MULTIPLY);
    }
}
