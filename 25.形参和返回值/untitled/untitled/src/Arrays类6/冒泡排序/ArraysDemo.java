package Arrays类6.冒泡排序;

import java.util.Arrays;

/*
    冒泡排序：
        一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
        依次对所有的数据进行操作，直至所有数据按要求完成排序。
    1.如果有n个数据进行排序，总共要比较n-1次
    2.每一次比较完毕，下一次的比较就会少一个数据参与
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前：" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
