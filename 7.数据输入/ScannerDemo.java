/*
	Scannerʹ�õĻ�������
	�� ����
		import java.util.Scanner;
		�����Ķ�������������ඨ����ϱߡ�
		
	�� ��������
		Scanner sc = new Scanner(System.in);
		���������ʽ���棬ֻ��sc�Ǳ����������Ա䣬�����Ķ�������䡣
		
	�� ��������
		int i = sc.nextInt();
		���������ʽ���棬ֻ��i�Ǳ����������Ա䣬�����Ķ��������
*/
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		int x = sc.nextInt();
		
		//�������
		System.out.println("x:" + x);
	}
}