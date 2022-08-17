package 构造方法7;

/*
    构造方法是一种特殊的方法
    作用：创建对象
    格式：public class 类名 {
            修饰符 类名(参数) {

            }
    }
    修饰符一般使用：public
    功能：主要是完成对象数据的初始化
 */
public class student {

    //成员变量
    private String name;
    private int age;

    //构造方法
    public student() {
        System.out.println("无参构造方法");
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
