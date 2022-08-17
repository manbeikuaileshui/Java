package 逢七过;

/*
    规则：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时要说：过。
    需求：打印出1-100之间满足逢七过的数字
 */
public class fengqigup {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
