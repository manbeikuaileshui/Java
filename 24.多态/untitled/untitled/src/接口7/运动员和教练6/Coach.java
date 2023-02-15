package 接口7.运动员和教练6;
/*
    定义抽象的教练类
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
