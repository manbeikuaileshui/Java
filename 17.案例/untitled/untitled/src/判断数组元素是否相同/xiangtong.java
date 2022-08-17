package 判断数组元素是否相同;

/*
    设计一个方法，用于比较两个数组的内容是否相同
 */
public class xiangtong {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = panduan(arr1, arr2);
        System.out.println(result);
    }

    public static boolean panduan(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
