package com.test;

import com.exercise.clock.Clock;
import com.exercise.primenumber.primeNum;

import java.util.Timer;

/**
 * Created by Fyol93 on 2016/9/9.
 */
public class Exercise {
     public static void main(String[] args)
     {
         new Timer().schedule(new Clock(),1000,1000);
//         new primeNum().run();
     }
}
