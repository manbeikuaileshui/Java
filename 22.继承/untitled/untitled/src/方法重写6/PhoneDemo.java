package 方法重写6;
/*
    方法重写概述：子类中出现了和父类中一模一样的方法声明
    方法重写的应用：当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了父类的功能，
                 又定义了子类特有的内容
    练习：手机类和新手机类
    @Override：1.是一个注解  2.可以帮助我们检查重写方法的方法声明的正确性
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p = new Phone();
        p.call("林青霞");

        newPhone np = new newPhone();
        np.call("林青霞");
    }
}
