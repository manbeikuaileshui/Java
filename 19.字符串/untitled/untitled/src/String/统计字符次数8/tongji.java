package String.统计字符次数8;

import java.util.Scanner;

/*
    需求：
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其它字符)
        判断字符是否属于大写字母、小写字母、数字的方法：
            1.字符名 >= 'A' && 字符名 <= 'Z'
            2.字符名 >= 'a' && 字符名 <= 'z'
            3.字符名 >= '0' && 字符名 <= '9'
 */
public class tongji {
    public static void main(String[] args) {
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                bigCount++;
            } else if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                smallCount++;
            } else {
                numberCount++;
            }
        }
        System.out.println("大写字母" + bigCount + "个");
        System.out.println("小写字母" + smallCount + "个");
        System.out.println("数字" + numberCount + "个");
    }
}
