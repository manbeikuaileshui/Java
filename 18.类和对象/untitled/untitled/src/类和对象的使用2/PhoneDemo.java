package 类和对象的使用2;
/*
    创建对象：
        格式：类名 对象名 = new 类名();
         例：Phone P = new Phone();
    使用对象：
        1.使用成员变量：
            格式：对象名.变量名
             例：p.brand
        2.使用成员方法：
            格式：对象名.方法名()
             例：p.call()
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
       p.call();
       p.sendMessage();
    }
}
