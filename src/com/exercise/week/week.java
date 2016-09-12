package com.exercise.week;

import java.util.Scanner;

/**
 * Created by Fyol93 on 2016/9/12.
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母
 * 程序分析：用情况语句较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母
 * Monday Tuesday Wednesday Thursday Friday Saturday Sunday
 */
public class week {
    public void run(){
        String input= null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字母：\n");
        input = scanner.next();
        switch(input){
            case "m":
            case "M":
                System.out.println("Monday\n");
                break;
            case "t":
            case "T":
                System.out.println("请输入第二个字母：\n");
                input = scanner.next();
                switch (input){
                    case "u":
                    case "U":
                        System.out.println("Tuesday\n");
                        break;
                    case "h":
                    case "H":
                        System.out.println("Thursday\n");
                        break;
                    default:
                        System.out.println("非法输入\n");
                        break;
                }
                break;
            case "w":
            case "W":
                System.out.printf("Wednesday\n");
                break;
            case "f":
            case "F":
                System.out.println("Friday\n");
                break;
            case "s":
            case "S":
                System.out.println("请输入第二个字母：\n");
                input = scanner.next();
                switch (input){
                    case "a":
                    case "A":
                        System.out.println("Saturday\n");
                        break;
                    case "u":
                    case "U":
                        System.out.println("Sunday\n");
                        break;
                    default:
                        System.out.println("非法输入\n");
                        break;
                }
                break;
            default:
                System.out.println("非法输入\n");
                break;
        }
    }
}
