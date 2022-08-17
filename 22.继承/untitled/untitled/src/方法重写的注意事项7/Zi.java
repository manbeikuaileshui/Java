package 方法重写的注意事项7;

public class Zi extends Fu {

    // 私有方法不能被重写(父类私有成员子类是不能继承的)
    /*@Override
    private void show() {
        System.out.println("Zi中show()方法被调用");
    }*/

    //父类不带修饰符，子类也可不带修饰符
    /*@Override
    void method() {
        System.out.println("Fu中method()方法被调用");
    }*/

    //父类不带修饰符，子类也可带权限比默认修饰符高的修饰符
    @Override
    public void method() {
        System.out.println("Fu中method()方法被调用");
    }
}
