package 案例9.猫和狗2;

/*
    需求：请采用继承的思想实现猫和狗的案例，并在测试类中进行测试
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
