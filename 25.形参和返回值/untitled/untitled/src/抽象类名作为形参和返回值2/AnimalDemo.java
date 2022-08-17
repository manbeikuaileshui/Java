package 抽象类名作为形参和返回值2;
/*
    1.方法的形参是抽象类名，其实需要的是该抽象类的子类对象
    2.方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal ao1 = ao.getAnimal();
        ao1.eat();
    }
}
