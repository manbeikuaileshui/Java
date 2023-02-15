package StringBuilder.StrBui与Str相互转换4;
/*
    1.StringBuilder 转换为 String
        String 变量名 = StringBuilder创建的字符串名.toString();
        通过toString()就可以把StringBuilder转换为String
    2.String 转换为 StringBuilder
        StringBuilder 变量名 = new StringBuilder(字符串变量名)
        通过构造方法就可以实现把String转换为StringBuilder
 */
public class zhuanhuan {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder s = new StringBuilder();
        s.append("abc");
        String s1 = s.toString();
        System.out.println(s1);

        //String 转换为 StringBuilder
        String s2 = "abcd";
        StringBuilder s3 = new StringBuilder(s2);
        System.out.println(s3);
    }
}
