package Arrays类6.Arrays类;

import java.util.Arrays;

/*
    Arrays类包含用于操作数组的各种方法
        Arrays.toString(整型数组):返回指定数组的内容的字符串表示形式
        Arrays.sort(整型数组):按照数字顺序排列指定的数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
