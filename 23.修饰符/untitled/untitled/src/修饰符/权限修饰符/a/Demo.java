package 修饰符.权限修饰符.a;
/*
    修饰符     同一个类中  同一个包中子类无关类  不同包的子类  不同包的无关类
    private      √
    默认          √             √
    protected    √             √             √
    public       √             √             √             √
 */
public class Demo {
    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu f = new Fu();
        f.show2();
        f.show3();
        f.show4();
    }
}
