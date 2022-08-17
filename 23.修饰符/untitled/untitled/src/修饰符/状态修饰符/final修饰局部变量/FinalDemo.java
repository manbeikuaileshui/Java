package 修饰符.状态修饰符.final修饰局部变量;
/*
    final修饰局部变量
        1.变量是基本类型：final修饰指的是基本类型的数据值不能发生改变
        2.变量是引用类型：final修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变的
 */
public class FinalDemo {
    public static void main(String[] args) {
        //final修饰基本类型变量
        int age1 = 20;
        age1 = 100;
        System.out.println(age1);

        final int age2 = 20;
        //age2 = 100;  被final修饰后不能再被赋值
        System.out.println(age2);
        System.out.println("----------");

        //final修饰引用类型变量
        Student s1 = new Student();
        s1 = new Student();
        s1.age = 100;
        System.out.println(s1.age);

        final Student s2 = new Student();
        s2.age = 100;  // s2是一个地址值，被final修饰s2不能再改变，但其指向的内容是可变的
        //s2 = new Student();  //被final修饰s2不能再改变
        System.out.println(s2.age);
    }
}
