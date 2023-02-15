package 不死神兔;

/*
    需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第二十个月的兔子对数为多少？
 */
public class tutu {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("第二十个月的兔子对数为：" + arr[19]);
    }
}
