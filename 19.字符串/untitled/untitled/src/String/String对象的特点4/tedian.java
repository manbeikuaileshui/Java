package String.String对象的特点4;
/*
    1.通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址不同
    char[] chs = {'a', 'b', 'c'};
    String s1 = new String(chs);
    String s2 = new String(chs);
    上面的代码中，JVM会首先创建一个字符数组，然后每一次new的时候都会有一个新的地址，只不过s1和s2参考的字符串内容是相同的

    2.以""方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，JVM都只会建立一个String对象，
      并在字符串池中维护
      String s3 = "abc";
      String s4 = "abc";
      在上面的代码中，针对第一行代码，JVM会建立一个String对象放在字符池中，并给s3参考；
      第二行则让s4直接参考字符串池中的String对象，也就是说它们本质上是同一个对象
 */
public class tedian {
}
