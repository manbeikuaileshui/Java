package 内部类4.成员内部类2;

/*
    按照内部类在类中定义的位置不同，可以分为如下两种形式
        1.在类的成员位置：成员内部类
        2.在类的局部位置：局部内部类
    成员内部类，外界如何创建对象使用呢？
        格式：外部类名.内部类名 对象名 = new 外部类对象.new 内部类对象；
        范例：Outer.Inner oi = new Outer().new Inner();
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象并调用方法
        //Inner i = new Inner();不能直接创建

        //Outer.Inner oi = new Outer().new Inner();
        //oi.show();

        Outer o = new Outer();
        o.method();
    }
}
