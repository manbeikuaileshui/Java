package String.字符串反转10;

import java.util.Scanner;

/*
    需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
        例如：键盘录入abc，输出结果cba。
 */
public class fanzhuan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        String s1 = reverse(s);

        System.out.println(s1);
    }

    public static String reverse(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }
}
