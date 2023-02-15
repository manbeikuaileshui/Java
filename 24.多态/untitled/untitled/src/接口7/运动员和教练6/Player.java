package 接口7.运动员和教练6;
/*
    定义抽象的运动员类
 */
public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void study();
}
