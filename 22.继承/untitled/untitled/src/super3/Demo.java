package super3;
/*
    super关键字的用法和this关键字的用法相似
         1.this：代表本类对象的引用
         2.super:代表父类存储空间的标识(可以理解为父类对象引用)
     this：
        1.this.成员变量        访问本类成员变量
        2.this(...)          访问本类构造方法
        3.this.成员方法(...)  访问本类成员方法
    super：
        1.super.成员变量  访问父类成员变量
        2.super(...)    访问父类构造方法
        3.super(...)    访问父类成员方法
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Zi z = new Zi();
        z.show();
    }
}
