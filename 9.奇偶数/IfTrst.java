/*
	奇偶数
	需求：
		任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
*/

//导包
import java.util.Scanner;

public class IfTrst {
	public static void main(String[] args) {
		
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
		
		//接收数据
		int number = sc.nextInt();
		
		//判断奇偶数
		if(number % 2 == 0) {
			System.out.println(number + "是偶数");
		} else {
			System.out.println(number + "是奇数");
		}
	}
}