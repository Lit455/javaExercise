package com.exercise.clock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by Fyol93 on 2016/9/9.
 */
public class Clock extends TimerTask {
    String str = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    @Override
    public void run() {
        str = sdf.format(new Date());
        System.out.println(str + "");
    }
}
