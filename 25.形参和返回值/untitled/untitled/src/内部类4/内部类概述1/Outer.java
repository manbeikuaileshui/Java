package 内部类4.内部类概述1;
/*
    内部类：就是在一个类中定义一个类。
    举例：在一个类A的内部定义一个类B，类B就被称为内部类。
    内部类的访问特点：
        1.内部类可以直接访问外部类的成员，包括私有
        2.外部类要访问内部类的成员，必须创建对象
    内部类的定义格式：
        格式：public class类名 {
                  修饰符 class 类名 {
                  }
             }
        范例：public class Outer {
                  修饰符 class 类名 {
                  }
             }
 */
public class Outer {
    private  int num = 10;
    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        //show(); 外部类不能直接访问内部类的成员，必须要创建对象
        Inner i = new Inner();
        i.show();
    }
}
