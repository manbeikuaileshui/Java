package 接口7.接口的成员特点2;
/*
    1.成员变量
        只能是常量
        默认修饰符：public static final
    2.构造方法
        接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在的
        一个类如果没有父类，默认继承自Object类
    3.成员方法
        只能是抽象方法
        默认修饰符：public abstract
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new Interlmpl();
        //i.num = 30;  接口中的变量默认被final修饰的
        System.out.println(i.num);
        //i.num2 = 40;  被final修饰无法再次赋值
        System.out.println(i.num1);
        System.out.println(Inter.num);
    }
}
