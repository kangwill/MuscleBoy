package com.example.willipai.muscleboy;

import java.util.Date;

/**
 * Created by kalpanjasani on 10/28/17.
 */

public class MuscleGrp {
    String name;
    String[] excercies;

    public MuscleGrp(String name, String[] excercies)
    {
        this.name = name;
        this.excercies = excercies;
    }
    public String toString()
        {
            return name;
        }
}
