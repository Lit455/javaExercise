package com.test;

import com.exercise.ithread.IThread;
import com.exercise.numberUtil.numberUtil;
import com.exercise.uclock.uClock;

import java.util.Timer;

/**
 * Created by Fyol93 on 2016/9/9.
 *
 * Timer:时钟
 * primeNumber:素数筛选
 * fallenBall:小球掉落
 * pingPong:赛程安排
 * week:星期查询
 * numberUtil:数字排序
 */
public class Exercise {
     public static void main(String[] args)
     {
//         new Timer().schedule(new uClock(),1000,1000);
//         new primeNum().run();
//         new fallenBall().run();
//         new pingPong().run();
//         new week().run();
//         new numberUtil().run();
         new IThread("A").start();
         new IThread("B").start();
     }
}
