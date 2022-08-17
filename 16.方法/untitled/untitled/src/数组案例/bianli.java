package 数组案例;
/*
    System.out.println(arr[i]); //换行输出
    System.out.print(arr[i]); //一行输出
    System.out.println(); //换行
*/
public class bianli {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        bianliyuansu(arr);
        int max = Max(arr);
        System.out.println("max:" + max);
        int min = Min(arr);
        System.out.println("min:" + min);
    }

    //需求：遍历数组一行输出。例：[11,22,33,44]
    public static void bianliyuansu(int[] arr) {
        System.out.print("[");
        for(int i=0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    //需求：设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
    public static int Max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //需求：设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
    public static int Min(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
