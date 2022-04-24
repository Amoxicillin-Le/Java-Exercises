package com.amoxicillin.le;

import java.util.Scanner;

public class Test {

//    一、题目
//    程序员小明打了一辆出租车去上班。
//    出于职业敏感，他注意到这辆出租车的计费表有点问题，总是偏大。
//    出租车司机解释说他不喜欢数字4，所以改装了计费表，
//    任何数字位置遇到数字4就直接跳过，其余功能都正常。
//    比如:
//    23再多一块钱就变为25；
//    39再多一块钱变为50；
//    399再多一块钱变为500；
//    小明识破了司机的伎俩，准备利用自己的学识打败司机的阴谋。
//    给出计费表的表面读数，返回实际产生的费用
//
//    二、输入输出描述
//    输入描述: 只有一行，数字N，表示里程表的读数。(1<=N<=888888888)。
//    输出描述: 一个数字，表示实际产生的费用。以回车结束。
//
//    三、示例
//    示例1:
//    输入 5
//    输出 4
//    说明: 5表示计费表的表面读数。4表示实际产生的费用其实只有4块钱。
//
//    示例2:
//    输入 17
//    输出 15
//    说明 : 17表示计费表的表面读数。15表示实际产生的费用其实只有15块钱。
//
//    示例3:
//    输入 100
//    输出 81
//    说明: 100表示计费表的表面读数。81表示实际产生的费用其实只有81块钱。
//
//    示例4:
//    输入 5
//    输出 4
//    说明: 5表示计费表的表面读数。4表示实际产生的费用其实只有4块钱。
//
//    示例5:
//    输入 17
//    输出 15
//    说明 : 17表示计费表的表面读数。15表示实际产生的费用其实只有15块钱。
//
//    示例6:
//    输入 100
//    输出 81
//    说明: 100表示计费表的表面读数。81表示实际产生的费用其实只有81块钱。

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入里程数:");
            int inputMileage = sc.nextInt();
            System.out.println("输入里程数:" + inputMileage);

            int skipMileage = handle(inputMileage);
            System.out.println("跳过里程数:" + skipMileage);

            System.out.println("实际里程数:" + (inputMileage - skipMileage));
        }
    }

    public static int handle(int mileage) {
        int  temp = 0, k = 0, j = 1;
        while (mileage > 0) {
            if (mileage % 10 > 4) {
                temp += (mileage % 10 - 1) * k + j;
            } else {
                temp += (mileage % 10) * k;
            }
            // System.out.println("tmep " + temp);
            k = k * 9 + j;
            // System.out.println("k " + k);
            j *= 10;
            // System.out.println("j " + j);
            mileage /= 10;
            // System.out.println("mileage " + mileage);
        }
        return temp;
    }
}

