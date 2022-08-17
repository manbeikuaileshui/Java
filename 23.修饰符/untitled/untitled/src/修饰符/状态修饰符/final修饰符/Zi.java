package 修饰符.状态修饰符.final修饰符;

import 修饰符.状态修饰符.final修饰符.Fu;

public class Zi extends Fu {
  /*  @Override   方法method被final修饰不能被重写
    public void method() {
        System.out.println("Zi method");
    }*/

    public final int age = 20;

    public void show() {
//        age = 100;   age的值被final修饰不能被修改
        System.out.println(age);
    }
}
