package 集合介绍1;

import java.util.ArrayList;

/*
    集合类的特点：提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
    集合类有很多，目前我们先学习一个：ArrayList
    ArrayList<E>:
                1.可调整大小的数组实现
                2.<E>:是一种特殊的数据类型，泛型
    怎么用呢？
            在出现E的地方我们使用引用数据类型替换即可
            举例：ArrayList<String>,ArrayList<Student>


    构造方法：ArrayList<数据类型> array = new ArrayList<>();  创建一个空的集合对象
    添加方法：变量名.add(添加的内容)  将指定的元素追加到此集合的末尾,返回值是boolean类型
            变量名.add(索引,添加的内容)  在此集合中的指定位置插入指定的元素
 */
public class gaishu {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();
        //输出集合
        System.out.println("array:" + array);

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //输出集合
        System.out.println("array:" + array);

        //添加元素
        array.add(3,"javase");
        //输出集合
        System.out.println("array:" + array);
    }
}
