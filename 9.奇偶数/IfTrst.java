/*
	��ż��
	����
		�������һ�����������ó���ʵ���жϸ���������������ż�������ڿ���̨�������������������ż����
*/

//����
import java.util.Scanner;

public class IfTrst {
	public static void main(String[] args) {
		
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		
		//��������
		int number = sc.nextInt();
		
		//�ж���ż��
		if(number % 2 == 0) {
			System.out.println(number + "��ż��");
		} else {
			System.out.println(number + "������");
		}
	}
}