package String.遍历字符串7;

import java.util.Scanner;

/*
    需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    求字符串长度：int 变量名 = 字符串对象名.length()
    遍历字符串：字符串对象名.charAt(i)
 */
public class bianli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        for(int i=0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
