package 接口7.运动员和教练6;
/*
    定义具体篮球运动员类
 */
public class BasketballPlayer extends Player {
    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
