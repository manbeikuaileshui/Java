package 标准类制作9;

/*
    1.成员变量
        ①使用private修饰
    2.构造方法
        ①提供一个无参构造方法
        ②提供一个带多个参数的构造方法
    3.成员方法
        ①提供每一个成员变量对应的set变量名()/get变量名()
        ②提供一个显示对象信息的show()
    4.创建对象并为其成员变量赋值的两种方法
        ①无参构造方法创建对象后使用set变量名()赋值
        ②使用带参构造方法直接创建带有属性值的对象
 */
public class student {
    //使用private修饰
    private String name;
    private int age;

    //无参构造方法
    public student() {}

    //带多个参数的构造方法
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //每一个成员变量对应的set变量名()/get变量名()
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    //显示对象信息的show()
    public void show() {
        System.out.println(name + "," + age);
    }
}
