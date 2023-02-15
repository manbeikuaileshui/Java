package String.用户登录6;

import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示
 */
public class anli {
    public static void main(String[] args) {
        String Name = "14754560420";
        String Passwork = "123456789";
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String passwork = sc.nextLine();
            if(name.equals(Name) && passwork.equals(Passwork)) {
                System.out.println("登录成功！");
                break;
            } else if ((!name.equals(Name)) && passwork.equals(Passwork)) {
                System.out.println("用户名错误");
                jihui(i);
            } else if(name.equals(Name) && (!passwork.equals(Passwork))) {
                System.out.println("密码错误!");
                jihui(i);
            } else {
                System.out.println("用户名和密码都错误!");
                jihui(i);
            }
        }
    }
    public static void jihui(int i) {
        if(i == 2) {
            System.out.println("三次输入错误，账户被锁定！！！");
        } else {
            System.out.println("你还有" + (2-i) + "次机会");
        }
    }
}
