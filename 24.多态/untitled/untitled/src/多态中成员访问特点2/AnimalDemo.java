package 多态中成员访问特点2;
/*
    成员变量：编译看左边，执行看左边
    成员方法：编译看左边，执行看右边
    为什么成员变量和成员方法的访问不一样呢？
        因为成员方法有重写，而成员变量没有
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        //访问成员变量
        System.out.println(a.age);  //访问的是父类中的成员变量 编译执行都看左边
        //System.out.println(a.weight);  Animal中没有weigth这个成员变量

        //访问成员方法
        a.eat();  //访问的是子类中的成员方法  编译看左边，执行看右边
        //a.playGame();  Animal中没有playGame这个成员方法
    }
}
