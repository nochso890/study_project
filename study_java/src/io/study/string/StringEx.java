package io.study.string;

public class StringEx {

	public static void main(String[] args) {
		String name = "ȫ" + "�浿";
		String nameAndHeight = name + 180.6;
		
		//���� �����غ��� �� ����Ǵ� ��� ���� �Ʒ��� ���� �ּ����� �޾ƺ�����.
		System.out.println("�̸� : "+name); // ȫ�浿
		System.out.println("�̸��� Ű :"+ nameAndHeight);
		System.out.println(100 + " ");
		System.out.println(" " + 100);
		System.out.println(100 + "");
		System.out.println("" + 100);
		System.out.println("" + "");
		System.out.println(100 + 100 + "");
		System.out.println("" + 100 + 100);
	}
}
