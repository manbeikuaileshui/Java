package 构造方法的注意事项8;
/*
    1.构造方法的创建
        ①如果没有定义构造方法，系统将给出一个默认的无惨数构造方法
        ②如果定义了构造方法，系统将不再提供默认的构造方法
    2.构造方法的重载
        ①如果自定义了带参数构造方法，还要使用无参数构造方法，就必须再写一个五参数构造方法
    3.推荐使用方式
        无论是否使用，都手工书写无参数构造方法
 */
public class student {
    private String name;
    private int age;

    public student() {}

    public student(String name) {
        this.name = name;
    }

    public student(int age) {
        this.age = age;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
