package 数组常见操作;
/*
计算数组中元素的个数：
           格式：数组名.length
            例：arr.length
*/
public class length {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //获取数组中的最值
        int max = arr[0];
        int min = arr[0];
        for(int i =1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            } if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
