package 常用方法2;

import java.util.ArrayList;

/*
    删除指定元素，返回删除是否成功:boolean 变量名 = 变量名.remove(要删除的元素);
    删除指定索引处的元素，返回被删除的元素:数据类型 变量名 = 变量名.remove(索引);
    修改指定索引处的元素，返回被修改的元素:数据类型 变量名 = 变量名.set(索引,要修改的新内容);
    返回指定索引处的元素:数据类型 变量名 = 变量名.get(索引);
    返回集合中的元素的个数:int 变量名 = 变量名.size();
 */
public class fangfa {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //输出集合
        System.out.println("array:" + array);
        System.out.println("-----------");

        //删除指定元素，返回删除是否成功
        System.out.println(array.remove("world"));;
        System.out.println(array);
        System.out.println("-----------");

        //删除指定索引处的元素，返回被删除的元素
        System.out.println(array.remove(1));;
        System.out.println(array);
        System.out.println("-----------");

        //修改指定索引处的元素，返回被修改的元素
        System.out.println(array.set(0,"java"));
        System.out.println(array);
        System.out.println("-----------");

        //返回指定索引处的元素
        System.out.println(array.get(0));;

        //返回集合中的元素的个数
        System.out.println(array.size());
    }
}
