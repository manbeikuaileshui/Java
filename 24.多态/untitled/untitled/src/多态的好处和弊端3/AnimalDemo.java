package 多态的好处和弊端3;
/*
    多态的好处：提高了程序的扩展性
        具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
    多态的弊端：不能使用子类的特有功能
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);
        //ao.lookDoor(); 不能访问子类的特有的功能

        Pig p = new Pig();
        ao.useAnimal(p);
    }
}
