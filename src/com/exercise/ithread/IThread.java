package com.exercise.ithread;

import com.exercise.uclock.uClock;

import java.util.Timer;

/**
 * Created by Fyol93 on 2016/9/13.
 */
public class IThread extends Thread {
    String str;

    public IThread(String str) {
        this.str = str;
    }

    public void run(){
        System.out.println(str);
        new Timer().schedule(new uClock(),1000,1000);
    }
}
