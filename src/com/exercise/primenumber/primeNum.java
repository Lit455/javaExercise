package com.exercise.primenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Fyol93 on 2016/9/9.
 */
public class primeNum {
    List<Integer> userNum = new ArrayList<Integer>();
    List<Integer> pNum = new ArrayList<Integer>();
    List<Integer> allNum = new ArrayList<Integer>();
    int inPut = 2;

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        for(int a=1;a<=1000;a++) {
            allNum.add(a);
        }
            System.out.println
                ("**********************************************************" + "\n" +
                 "* 1.................Input  numbers you need to calculate *" + "\n" +
                 "* 2...System automaticlly output prime number under 1000 *" + "\n" +
                 "* Input '1' OR '2':                                      *" + "\n" +
                 "**********************************************************" + "\n");
        char choice = 0;
        while(choice == 2)
        {
            switch (choice){
                case 1:

                    break;
                case 2:
                    pNum.add(2);
//                    int s1 = pNum.get(0);
//                    int s2 = pNum.get(1);
/**
 主要思路：
 通过循环，将最小素数的倍乘数去掉。
 在剩下的数中再取最小的数，该数就
 是接下来最小的素数，重复以上步骤
 直至素数筛选完毕
 */
                    //第一层循环
                    for(int i=1;i<=999;i++)
                    {

                    //判断是否已经删除该内存中的数据
                        if(allNum.get(i-1) == 0)
                            continue;
                     //第二层循环，
                        for(int j=1;j*i<999;j++)
                        {

                            if(allNum.get(i+j-2<999?i+j-2:999) == i*j)
                                allNum.set(j-1,0);
                        }

                        if(allNum.get(i-1) != 0)
                            pNum.set(inPut++>999?inPut:999,allNum.get(i));
                    }
                    break;
            }

        }

        for(int s =0 ; s < pNum.size(); s ++ )
            System.out.println(pNum.get(s));
    }
}
