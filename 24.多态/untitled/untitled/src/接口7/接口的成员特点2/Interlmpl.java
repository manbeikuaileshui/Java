package 接口7.接口的成员特点2;

//public class Interlmpl implements Inter {  默认存在extends Object，等价于下面一行的代码
public class Interlmpl extends Object implements Inter {
    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    public Interlmpl() {
        super();
    }
}
