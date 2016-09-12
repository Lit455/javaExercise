package com.exercise.pingpong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fyol93 on 2016/9/12.
 * 两个乒乓球队进行比赛，各出3人。甲队为a,b,c三人，乙队为x,y,z三人。
 * 以抽签的方式决定比赛名单。有人向队员打听比赛的名单，a说他不和x比。
 * c说他不和x,z比，编程找出比赛安排。
 */
public class pingPong {
    String m1,m2,m3;
    public pingPong(String m1,String m2,String m3){this.m1 = m1;this.m2 = m2;this.m3 = m3;}
    public pingPong(){}
    public void run(){
        List<pingPong> schedul = new ArrayList<>();
        String[] team2 = {"x","y","z"};
        pingPong yi;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++){
                yi = new pingPong(team2[i],team2[j],team2[k]);
                if(!yi.m1.equals(yi.m2)&&!yi.m2.equals(yi.m3)&&!yi.m1.equals(yi.m3)&&
                        !yi.m1.equals("x")&&!yi.m3.equals("x")&&!yi.m3.equals("z"))
                    schedul.add(yi);
                }
        System.out.println(schedul);
    }
    public String toString(){
        return "a的对手是" + m1 + ",b的对手是" + m2 + ",c的对手是" + m3;
    }
}
