package 多态中成员访问特点2;

public class Cat extends Animal {
    public int age = 20;
    public int weigth = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
