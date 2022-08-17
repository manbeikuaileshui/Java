package private关键字4;
/*
    private关键字：
        1.是一个权限修饰符
        2.可以修饰成员（成员变量和成员方法）
        3.作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问

    针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
        1.提供”get变量名()“方法，用于获取成员变量的值，方法用public修饰
        2.提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰
 */
public class student {

    //成员变量
    String name;
    private int age;

    //提供get/set方法
    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }
    public int getAge() {
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }

}
