package 抽象类6.抽象类的成员特点3;
/*
    1.成员变量
        可以是变量
        也可以是常量
    2.构造方法
        有构造方法，但是不能实例化
        那么，构造方法的作用是什么呢？用于子类访问父类数据的初始化
    3.成员方法
        可以有抽象方法：限定子类必须完成某些动作
        也可以有非抽象方法：提高代码复用性
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.show();
    }
}
