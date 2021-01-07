package io.study.variable;

/*
 * primitive Type(�⺻��)
 * ���� : boolean
 * ������ : char
 * ������ : byte, short, int, long
 * �Ǽ��� : float, double
 */
public class VarEx0 {

	public static void main(String[] args) {
		boolean power = true; // true �Ǵ� false �� ���� ����Ǹ�, ��ҹ��ڸ� �����Ѵ�.
		char ch = 'A'; // �ϳ��� ���ڸ� �����ϸ�, �빮�� A�� �����ڵ忡 ���� 65�� ����.
		int number = 65;
		
		if(ch == number) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
		System.out.println("char ?? "+ (char)65); //int 65 �� char �� ����� ����ȯ�� �Ͽ�����. �����ڵ尪�� ���� ǥ��.
		
		//���� ���� ����� �����Ͽ� �ּ����� ����� ������ �ۼ��� ������.
		short min = -32768;
		short max = 32767;
		System.out.println(min - 1); //min�� short Type ������ 1 ������ int Type���� �ڵ�����ȯ�Ǿ�  -32769 �� ǥ�õ�. 
		System.out.println(max + 1);
		System.out.println((short)(min-1));
		System.out.println((short)(max+1));
		
		float f = 9.1234567901234567980f;
		double d = 9.12345678901234567890;
		
		System.out.println("float : "+f); //�Ҽ��� ���� 6° ���� ǥ��. 7��° ���� �ݿø�.
		System.out.println("double : "+d);
	}
}
