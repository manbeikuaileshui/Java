package 抽象类6.抽象类的成员特点3;

public abstract class Animal {

    private final String city = "北京";
    private int age = 20;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
        //city = "上海";  被final修饰不能被修改
        System.out.println(city);
    }
    public abstract void eat();
}
