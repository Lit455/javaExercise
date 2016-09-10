package com.exercise.fallenBall;

/**
 * Created by Fyol93 on 2016/9/10.
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下。
 * 求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */

public class fallenBall {
    double height = 100;
    double totalHeight = 100;
    int times = 0;
    public void run() {
        for(int i = 1 ; i<=10 ; i++){
            times = (int) Math.pow(2,i);
            totalHeight = totalHeight + height/2;
            height = 100.00/times;
            System.out.println("第" + i + "次弹跳高度：" + height +
                    "米 目前经过了" + totalHeight + "米 ");
        }
    }
}
