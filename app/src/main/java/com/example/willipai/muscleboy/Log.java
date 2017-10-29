package com.example.willipai.muscleboy;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kalpanjasani on 10/29/17.
 */
/*serialiazble class to store logs*/
public class Log implements Serializable{
    public int reps;
    public float weight;
    public Date date;
    public Excercise excercise;
    public String muscleGrp;

}
