/*
	����
		�������ɽ������������壨8844.43��=8844430���ף�����������һ���㹻���ֽ�����ĺ����0.1���ס�
		���ʣ����۵����ٴΣ������۳����������ĸ߶ȣ�
*/

public class WhileDemo {
	public static void main(String[] args) {
		int zf = 8844430;
		double paper = 0.1;
		int count = 0;
		while(zf >= paper) {
			paper *= 2;
			count++;
		}
		System.out.println("��Ҫ��" + count + "��");
	}
}