package 修饰符.状态修饰符.final修饰符;
/*
    final关键字是最终的意思，可以修饰成员方法，成员变量，类
    final修饰的特点
        1.修饰方法：表明该方法是最终方法，不能被重写
        2.修饰变量：表明该变量是常量，不能再次被赋值
 */
public class Fu {
    public final void method() {
        System.out.println("Fu method");
    }
}

/*  Fu被final修饰表示为最终类，不能再有子类
public final class Fu {
    public final void method() {
        System.out.println("Fu method");
    }
}
*/
