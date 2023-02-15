package 数组元素求和;

/*
    需求：
        求和的元素个位和十位都不能是7，并且只能是偶数
        {68,27,95,88,171,996,51,210}
 */
public class sum {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                Sum += arr[i];
            }
        }
        System.out.println("和为：" + Sum);
    }
}
