package io.study.variable;

//�κ����� �� ��ȯ�ϱ�.
public class VarEx2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0; //x���� �ӽ÷� ������ ���� ����
		
		tmp = x; //x�� ���� tmp �� ����.
		x = y; // y�� ���� x�� �����.
		y = tmp; // y �� ���� x���� ����Ǿ��ִ� tmp ���� �����.
		
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		// ����
		// int Type A �� B��  A�� 30 �� B�� 40 ���� �ʱ�ȭ ��
		// B �� A�� ���� �������ϰ� A�� B�� ���� ������ �κ����� ��ȯ �ϴ� ���� �� ����� �Ʒ� �ۼ��� ������.
		
		
		
	}
}
