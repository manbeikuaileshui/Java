package 修饰符.权限修饰符.b;
import 修饰符.权限修饰符.a.Fu;
public class Zi extends Fu {
    public static void main(String[] args) {
        //创建Zi的对象，测试看有哪些方法可以使用
        Zi z = new Zi();
        z.show3();
        z.show4();
    }
}
