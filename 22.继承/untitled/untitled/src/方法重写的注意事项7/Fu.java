package 方法重写的注意事项7;
/*
    方法重写注意事项
        1，私有方法不能被重写(父类私有成员，子类是不能继承的)
        2.子类方法访问权限不能更低(public > 默认 > 私有)
 */
public class Fu {
    private void show() {
        System.out.println("Fu中show()方法被调用");
    }

    //带public修饰符
  /*  public void method() {
        System.out.println("Fu中method()方法被调用");
    }*/

    //不带修饰符，有默认的修饰符，但权限比public低
    void method() {
        System.out.println("Fu中method()方法被调用");
    }
}
