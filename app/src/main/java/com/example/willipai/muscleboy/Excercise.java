package com.example.willipai.muscleboy;

import java.util.Date;

/**
 * Created by kalpanjasani on 10/28/17.
 */

public class Excercise {
    String name;
    String[] muscleGroups;
    int reps;
    double weight;
    Date date;

    public Excercise(String name, String[] muscleGroups)
    {
        this.name = name;
        this.muscleGroups = muscleGroups;
    }
    public String toString()
        {
            return name;
        }
}
