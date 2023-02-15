package 案例9.猫和狗2;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Cat c1 = new Cat();
        c1.setName("咪咪");
        c1.setAge(2);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();
        System.out.println("----------");

        Cat c2 = new Cat("菜菜", 3);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();
        System.out.println("----------");

        //创建狗类对象进行测试
        Dog d1 = new Dog();
        d1.setName("旺财");
        d1.setAge(3);
        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookDoor();
        System.out.println("----------");

        Dog d2 = new Dog("小白", 4);
        System.out.println(d2.getName() + "," + d2.getAge());
        d2.lookDoor();
    }
}
