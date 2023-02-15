package StringBuilder.添加和反转3;
/*
                      方法名                                   说明
    StringBulider创建的变量名.append(添加的内容)      添加数据，并返回对象本身
    StringBulider创建的变量名.reverse()                  返回相反的字符序列
 */
public class tianjiafanzhuan {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("-----------");

        s1.append("hello");
        s1.append("world");
        s1.append(100);
        s2.append("hello").append("world").append(100);  //链式编程写法
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("-----------");

        s1.reverse();
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
    }
}
