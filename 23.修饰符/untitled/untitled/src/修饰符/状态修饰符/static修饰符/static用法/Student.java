package 修饰符.状态修饰符.static修饰符.static用法;

public class Student {
    public String name;
    public int age;
    public static String university;  //加上static表示这个成员变量是对所有对象共享的

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
