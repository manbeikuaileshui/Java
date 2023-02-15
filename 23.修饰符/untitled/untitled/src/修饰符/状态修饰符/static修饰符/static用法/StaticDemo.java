package 修饰符.状态修饰符.static修饰符.static用法;

/*
    stacit关键字：是静态的意思，可以修饰成员方法，成员变量
    static修饰的特点：
        1.被类的所有对象共享
            这也是我们判断是否使用静态关键字的条件
        2.可以通过类名调用 (推荐使用)
            例：Student.universitv = "传智大学";
            当然，也可以通过对象名调用
            例：s1.universitv = "传智大学";
 */
public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "传智大学";

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
        s1.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 33;
        s2.show();
    }
}
