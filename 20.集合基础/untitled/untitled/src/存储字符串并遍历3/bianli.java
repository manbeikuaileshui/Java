package 存储字符串并遍历3;

import java.util.ArrayList;

/*
    需求：创建一个存储字符串的集合，存储三个字符串元素，使用程序实现在控制台遍历该集合
 */
public class bianli {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            ;
        }


    }
}
