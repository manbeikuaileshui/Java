package 接口7.接口的特点1;
/*
    接口概述：
        接口就是一种公共的规范标准,只要符合规范标准，大家都可以通用
        java中的接口更多的体现在对行为的抽象
    接口的特点
        1.接口用关键字interface修饰
            public interface 接口名 {}
        2.类实现接口用implements表示
            public class 类名 implements 接口名 {}
        3.接口不能实例化
            接口如何实例化呢？参照多态的方式，通过实现类对象实例化，这叫接口多态。
            多态形式：具有类多态，抽象类多态，接口多态。
            多态前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
        4.接口的实现类
            要么重写接口中的所有抽象方法
            要么是抽象类
 */
public class JumppingDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
    }
}
