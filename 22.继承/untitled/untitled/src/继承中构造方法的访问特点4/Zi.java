package 继承中构造方法的访问特点4;

public class Zi extends Fu{
    public Zi() {
//        super();   默认存在的
        System.out.println("Zi中无参构造方法被调用");
    }
    public Zi(int age) {
//        super   默认存在的
        System.out.println("Zi中带参构造方法被调用");
    }
}
