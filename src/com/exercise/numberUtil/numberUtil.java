package com.exercise.numberUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Created by Fyol93 on 2016/9/12.
 * 排序
 */
public class numberUtil {
    List<Integer> num = new ArrayList<Integer>();
    public void run() {
        System.out.println("请输入数字：\n");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            num.add(scanner.nextInt());
        }
        int exchange;
//两个循环嵌套，从尾部开始两两判断后一个数是否比前一个数大，否的话交换两个数
        for(int k = 1; k < num.size(); k++)
            for (int i = 1; i < num.size(); i++) {
                if (num.get(num.size() - i) < num.get(num.size() - i - 1)) {
                    exchange = num.get(num.size() - i);
                    num.set(num.size() - i, num.get(num.size() - i - 1));
                    num.set(num.size() - i - 1, exchange);
                }
                else continue;
            }
//        System.out.println(num);
//        for(int j = 1; j < num.size(); j++)
//            if(num.get(num.size()-1) < num.get(j-1))
//                for(int k = 1; k <= (num.size() - j); k++){
//                    exchange = num.get(num.size() - k);
//                    num.set(num.size() - k, num.get(num.size() - k - 1));
//                    num.set(num.size() - k - 1, exchange);
//                }
        System.out.println(num);
    }

    @Override
        public String toString(){
            String str = null;
            for(int j = 0; j < num.size(); j++){
                str = (num.get(j) + " ");
            }
            return ("从小到大排序为：" + str);
    }
}

