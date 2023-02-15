package 反转;

/*
    需求：已知一个数组arr = {19,28,37,46,50};用程序实现把数组中的元素值交换，
         交换后的数组arr = {50,46,37,28,19};并在控制台输出交换后的数组元素。
 */
public class fanzhuan {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        swap1(arr);
        daying(arr);
        swap2(arr);
        daying(arr);
    }
    public static void swap1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(right > left) {
            int a = arr[right];
            arr[right] = arr[left];
            arr[left] = a;
            right--;
            left++;
        }
    }
    public static void swap2(int[] arr) {
       for(int start = 0, end = arr.length - 1; start <= end; start++,end--) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
       }
    }
    public static void daying(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
