/*
类型转换
*/
public class ConversionDemo {
	public static void main(String[] args) {
		//自动类型转换
		double d = 10;
		System.out.println(d);
		
		//定义byte类型的变量
		byte b = 10;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = b;
		System.out.println(i);
		
		// 这是不可以的，类型不兼容
		// char c = b;
		// System.out.println(c);
		
		//强制类型转换
		// int k = 88.88;  //错误的
		int k = (int)88.88;
		System.out.println(k);
	}
}