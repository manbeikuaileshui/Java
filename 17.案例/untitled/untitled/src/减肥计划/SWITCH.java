package 减肥计划;
/*
    导包方法：
        1.快捷键导包：选中目标，Alt+回车
        2.自动导包：直接创建对象
        3.手动导包：手动输入
 */

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();
        switch(week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }
}
