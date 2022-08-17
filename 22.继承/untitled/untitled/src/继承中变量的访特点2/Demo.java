package 继承中变量的访特点2;
/*
    测试类

    在子类方法中访问一个变量的方法
        1.子类局部范围找
        2.子类成员范围找
        3.父类成员范围找
        4.如果都没有就报错(不考虑父亲的父亲......)
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Zi z = new Zi();
        z.show();
    }
}
