/*
	Random�����ú�ʹ�ò��裺
		���ã����ڲ���һ�������
		ʹ�ò��裺
			�ٵ���
				import java.util.Random;
				�����Ķ�������������ඨ�������
			�ڴ�������
				Random r = new Random();
			�ۻ�ȡ�����
				int number = r.nextInt(10); //��ȡ���ݵķ�Χ��[0,10)����0��������10
				���������ʽ���棬number�Ǳ����������Ա䣬����10���Ա䡣�����Ķ��������
*/

//����
//	�������һ��1-100�����ֲ��³��Ǽ���

//����
import java.util.Random;
import java.util.Scanner;
public class RandomDemo {
	public static void main(String[] args) {
		
		//��������
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//��ȡ�����
		int number = r.nextInt(100) + 1;
		
		//������
		while(true){
			
			//���ն���
			System.out.println("������һ�����֣�");
			int num = sc.nextInt();
			
			if(num > number) {
				System.out.println("�´���");
			} else if(num < number) {
				System.out.println("��С��");
			} else {
				System.out.println("�¶���");
				break;
			}
		}
	}
}