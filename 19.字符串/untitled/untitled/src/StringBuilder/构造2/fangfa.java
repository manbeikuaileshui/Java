package StringBuilder.构造2;
/*
            方法名                                                             说明
    StringBuilder 变量名 = new StringBuilder()                 创建一个空白可变字符串对象，不含有任何内容
    StringBuilder 变量名 = new StringBuilder(字符串名或字符串)          根据字符串内容，来创建可变字符串对象
 */
public class fangfa {
    public static void main(String[] args) {

        StringBuilder s1 =new StringBuilder();
        System.out.println("s1:" + s1);
        System.out.println(s1.length());
        ;
        StringBuilder s2 = new StringBuilder("abcdef");
        System.out.println(s2);
        System.out.println(s2.length());
    }
}
