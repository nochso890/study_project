package io.study.printf;

//����ȭ�� ���
//printf �� �����ڸ� ���� ������ ���� �������� �������� ��� �Ѵ�.
public class PrintfEx1 {

	public static void main(String[] args) {
		/*
		 * �������� ���� �� ����
		 * %b : boolean ���� ��Ÿ���� ���
		 * %d : 10���� 
		 * %o : 8����
		 * %x, %X : 16����
		 * %f : 10����(�Ǽ�)
		 * %e, %E : ��������ǥ��
		 * %c : ����(character)
		 * %s : ���ڿ�(String)
		 */
		float floatPie = (float)123.123456789; //����� ����ȯ
		double doublePie = 123.123456789;
		
		System.out.printf("����� ���� : %c%n",'A');
		System.out.printf("�������� : %d%n",100);
		System.out.println("float : "+ floatPie);
		System.out.println("double : "+ doublePie);
		System.out.printf("float_pirntf : %f, %e, %g%n",floatPie,floatPie,floatPie);
		System.out.printf("double_printf : %.3f, %e, %g%n",doublePie,doublePie,doublePie); // %f�� .3 �� �Ҽ��� �Ʒ�3�ڸ������� ǥ���ǹ�
	}
}
