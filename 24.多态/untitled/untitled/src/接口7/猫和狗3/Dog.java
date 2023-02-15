package 接口7.猫和狗3;

public class Dog extends Animal implements Jumpping {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
