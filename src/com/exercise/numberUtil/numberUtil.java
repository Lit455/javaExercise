package com.exercise.numberUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        for (int i = 1; i < num.size(); i++) {
            //for(int j)
            if (num.get(num.size() - i) < num.get(num.size() - i - 1)) {
                exchange = num.get(num.size() - i);
                num.set(num.size() - i, num.get(num.size() - i - 1));
                num.set(num.size() - i - 1, exchange);
            }
        }
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

