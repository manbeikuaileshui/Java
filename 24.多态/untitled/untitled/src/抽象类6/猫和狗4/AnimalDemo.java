package 抽象类6.猫和狗4;
/*
    需求：请采用抽象类的思想实现猫和狗的案例，并在测试类中进行测试
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        //创建狗类对象
        Animal a1 = new Dog();
        a1.setName("旺财");
        a1.setAge(5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();

        a1 = new Dog("旺财", 5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
    }
}
