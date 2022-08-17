package 查找;

import java.util.Scanner;

/*
    需求：已知一个数组arr={19，28,37,46,50}，键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值
 */
public class chazhao {
    public static void main(String[] args) {
       int[] arr = {19,28,37,46,50};
       int number = chaozhao(arr);
       if (number == -1) {
           System.out.println("该数据不存在");
       } else {
           System.out.println(number);
       }
    }
    public static int chaozhao(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }
}
