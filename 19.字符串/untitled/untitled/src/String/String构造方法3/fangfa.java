package String.String构造方法3;
/*
                方法                                      说明
    String 变量名 = new String();            创建一个空白字符串对象，不含有任何内容
    String 变量名 = new String(字符数组名);    根据字符数组的内容，来创建字符串对象
    String 变量名 = new String(字节数组名);    根据字节数组的内容，来创建字符串对象
    String 变量名 = "字符串";                 直接赋值的方式创建字符串对象，内容就是""里面的内容
    字符数组：char[] chs = {'a', 'b', 'c'};
    字节数组：byte[] bys = {97,98,99};
 */
public class fangfa {
    public static void main(String[] args) {
        //String 变量名 = new String();  创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        //String 变量名 = new String(char[] chs);  根据字符数组的内容，来创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //String 变量名 = new String(字节数组名);    根据字节数组的内容，来创建字符串对象
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //String 变量名 = "字符串";  直接赋值的方式创建字符串对象，内容就是""里面的内容
        String s4 = "abcdef";
        System.out.println("s4:" + s4);
    }
}
