package 修饰符.状态修饰符.static修饰符.static访问特点;
/*
    非静态的成员方法
        1.能访问静态的成员变量
        2.能访问非静态的成员变量
        3.能访问静态的成员方法
        4.能访问非静态的成员方法

    静态的成员方法
        1.能访问静态的成员变量
        2.能访问静态的成员方法
    总结成一句话就是：静态成员方法只能访问静态成员
 */
public class Student {
    //非静态成员变量
    private String name = "林青霞";
    //静态成员变量
    private static String university = "传智大学";

    //非静态成员方法
    public void show1() {

    }

    //非静态成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员方法
    public static  void show3() {
    }

    //静态成员方法
    public static void show4() {
        //System.out.println(name);  // 静态成员方法不能访问非静态成员变量
        System.out.println(university);
        //show1();  // 静态成员方法不能访问非静态成员方法
        show3();
    }
}
