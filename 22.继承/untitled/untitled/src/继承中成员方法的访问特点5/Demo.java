package 继承中成员方法的访问特点5;
/*
    通过子类对象访问一个方法
                    1.子类成员范围找
                    2.父类成员范围找
                    3.如果都没有就报错(不考虑父亲的父亲...)
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Zi z = new Zi();
        z.method();
        z.show();
    }
}
