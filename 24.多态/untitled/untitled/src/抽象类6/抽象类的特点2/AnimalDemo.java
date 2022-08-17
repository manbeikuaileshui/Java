package 抽象类6.抽象类的特点2;
/*
    1.抽象类和抽象方法必须使用abstract关键字修饰
        public abstract class 类名 {}
        public abstract void 方法名();
    2.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    3.抽象类不能实例化
        抽象类如何实例化呢？参照多态的方式，通过子类对象实例化，这叫抽象类多态
    4.抽象类的子类
        要么重写抽象类中的所有抽象方法，要么是抽象类

 */
public class AnimalDemo {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Animal a = new Cat();
        a.eat();
        a.sleep();

    }
}
