package 存储学生对象并遍历4;
/*
    学生类
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student() {}

    //带参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //get方法
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //show方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
