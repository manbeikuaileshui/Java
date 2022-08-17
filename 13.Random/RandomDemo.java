/*
	Random的作用和使用步骤：
		作用：用于产生一个随机数
		使用步骤：
			①导包
				import java.util.Random;
				导包的动作必须出现在类定义的上面
			②创建对象
				Random r = new Random();
			③获取随机数
				int number = r.nextInt(10); //获取数据的范围：[0,10)包括0，不包括10
				上面这个格式里面，number是变量名，可以变，数字10可以变。其它的都不允许变
*/

//需求：
//	随机生成一个1-100的数字并猜出是几。

//导包
import java.util.Random;
import java.util.Scanner;
public class RandomDemo {
	public static void main(String[] args) {
		
		//创建对象
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//获取随机数
		int number = r.nextInt(100) + 1;
		
		//猜数字
		while(true){
			
			//接收对象
			System.out.println("请输入一个数字：");
			int num = sc.nextInt();
			
			if(num > number) {
				System.out.println("猜大了");
			} else if(num < number) {
				System.out.println("猜小了");
			} else {
				System.out.println("猜对了");
				break;
			}
		}
	}
}