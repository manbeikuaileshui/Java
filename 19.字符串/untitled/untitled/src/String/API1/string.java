package String.API1;
/*
Scanner:用于获取键盘录入数据。(基本数据类型，字符串数据)
注意：调用方法的时候，如果方法有明确的返回值，我们用变量接收可以手动完成，
    也可以使用快捷键的方式完成(Ctrl + Alt + V)或(Alt + 回车 + 回车)

    1.导包：import java.util.Scanner;
    2.创建对象：Scanner sc = new Scanner(System.in);
    3.接收数据：String 变量名 = sc.nextLine();
 */
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
//      sc.nextLine(); 写成这样再按 Ctrl + Alt + V 自动生成下面代码
        String line = sc.nextLine();
        System.out.println(line);
    }
}
