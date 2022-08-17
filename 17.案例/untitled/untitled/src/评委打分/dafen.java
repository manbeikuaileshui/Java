package 评委打分;

import java.util.Scanner;

/*
    需求：在编程比赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）。
 */
public class dafen {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个评委打分：");
            arr[i] = sc.nextInt();
        }
        int max = Max(arr);
        int min = Min(arr);
        int sum = Sum(arr);
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("选手平均分为：" + avg);
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
