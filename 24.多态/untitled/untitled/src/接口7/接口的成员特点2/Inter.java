package 接口7.接口的成员特点2;

import java.security.PublicKey;

public interface Inter {
    public int num = 10;
    public final int num1 = 20;
    public static final int num2 = 30;
    int num3 = 40;

    // public Inter() {}  接口中没有构造方法

    //public void show() {}  接口里面是不能有非抽象方法

    public abstract void method();
    void show();  //默认存在public abstract
}
