/*
	switch语句
	
	格式：
		switch(表达式) {
			case 值1:
				语句体1;
				brek;
			case 值2:
				语句体2；
				break;
			.......
			default:
				语句体n+1;
				[break;]
		}
		
	格式说明：
		表达式：取值为byte、short、int、char、JDK5以后可以是枚举，JDK7以后可以是String。
		case：后面跟的是要和表达式进行比较的值。
		break：表示中断，结束的意思，用来结束switch语句。
		default：表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
		
	执行流程：
		首先计算表达式的值。
		依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。
		如果所有的case后面的值和表达式的值都不匹配，就会执行default里面的语句，然后程序结束。
*/

//导包
import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("开始");
		
		//需求：键盘录入一个月份，输出对应的季节（冬季：12、1、2）
		
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个月份:");
		
		//接收对象
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("输入有误");
				break;
		}
		
		System.out.println("程序结束");
	}
}