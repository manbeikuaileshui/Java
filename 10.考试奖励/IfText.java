/*
���Խ�����
	
	95-100   ɽ�����г�һ��
	90-94    ���ֳ���һ��
	80-89    ���ν�����һ��
	80����   ����һ��
*/

//����
import java.util.Scanner;
public class IfText {
	public static void main(String[] args) {
		
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		
		//��������
		int score = sc.nextInt();
		
		//���ݲ��ԣ���ȷ���ݡ��߽����ݡ����������Լ��ж϶�Ӧ����
		if(score > 100 || score < 0) {
			System.out.println("������ķ�������");
		} else if(score >= 95 && score <= 100) {
			System.out.println("ɽ�����г�һ��");
		} else if(score >= 90 && score <= 94) {
			System.out.println("���ֳ���һ��");
		} else if(score >= 80 && score <= 89) {
			System.out.println("���ν�����һ��");
		} else {
			System.out.println("����һ��");
		}
	}
}