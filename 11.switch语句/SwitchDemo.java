/*
	switch���
	
	��ʽ��
		switch(���ʽ) {
			case ֵ1:
				�����1;
				brek;
			case ֵ2:
				�����2��
				break;
			.......
			default:
				�����n+1;
				[break;]
		}
		
	��ʽ˵����
		���ʽ��ȡֵΪbyte��short��int��char��JDK5�Ժ������ö�٣�JDK7�Ժ������String��
		case�����������Ҫ�ͱ��ʽ���бȽϵ�ֵ��
		break����ʾ�жϣ���������˼����������switch��䡣
		default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
		
	ִ�����̣�
		���ȼ�����ʽ��ֵ��
		���κ�case�����ֵ���бȽϣ�����ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬��ִ�еĹ����У�����break�ͻ������
		������е�case�����ֵ�ͱ��ʽ��ֵ����ƥ�䣬�ͻ�ִ��default�������䣬Ȼ����������
*/

//����
import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//���󣺼���¼��һ���·ݣ������Ӧ�ļ��ڣ�������12��1��2��
		
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���·�:");
		
		//���ն���
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.println("��������");
				break;
		}
		
		System.out.println("�������");
	}
}