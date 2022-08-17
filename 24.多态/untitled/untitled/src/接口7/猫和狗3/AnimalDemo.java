package 接口7.猫和狗3;
/*
    需求：对猫和狗进行训练，它们就可以跳高了，这里加入了跳高功能。请采用抽象和接口来实现猫狗案例，并在测试类中进行测试
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("-----------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("-----------");

        a = new Cat("加菲", 3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("-----------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(3);
        System.out.println(c.getName() + "," +c.getAge());
        c.eat();
        c.jump();
        System.out.println("-----------");

        c = new Cat("加菲", 3);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
        System.out.println("-----------");

        //创建狗类对象，调用方法
        Jumpping j1 = new Dog();
        j1.jump();
        System.out.println("-----------");

        Animal a1 = new Dog();
        a1.setName("旺财");
        a1.setAge(5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
        System.out.println("-----------");

        a1 = new Dog("旺财", 5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
        System.out.println("-----------");

        Dog d = new Dog();
        d.setName("旺财");
        d.setAge(5);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();
        System.out.println("-----------");

        d = new Dog("旺财", 5);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();

    }
}
