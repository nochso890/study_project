package io.study.variable;

/*
 * ������?
 * �� �ϳ��� ���� ������ �� �ִ� �޸𸮰���.
 */

/*
 * JAVA Protgrammer ���� ��Ģ
 * 1. Ŭ���� �̸��� ù ���ڴ� �׻� �빮�ڷ� �Ѵ�. (Variable)
 * 2. ���� �ܾ�� �̷���� ��� �ܾ��� ù���� ���� �빮�ڷ� �Ѵ�.(VariableExample)
 * 3. ����� �̸��� ��� �빮�ڷ� �ϸ�, �����ܾ��� ��� '_'�� �����Ѵ�.(ex. TEST_NUMBER)
 */
public class VarEx1 {
	/* 
	 * ������ ��� ��Ģ
	 * 1. ��ҹ��ڰ� ���еǸ� ���̿� ������ ����.
	 * 2. ���� ����ؼ��� �ȵȴ�.
	 *   -������ KeyWord �Ǵ� Reserved Word ��� �ϸ�, ���α׷��� ������ ���Ǵ� ����̴�.
	 * 3. ���ڷ� �����ؼ��� �ȵȴ�.
	 * 4. Ư�����ڴ� '_' �� '$'���� ����Ѵ�.
	 */

	public static void main(String[] args) {
		
		//boolean : ���� ���� Type
		//y : ���� ��
		boolean y = true; //�����ʱ�ȭ��, y��� �̸��� ������ ����ϱ� ���� �ʱ�ȭ �ϴ°�.
		System.out.println("y ���� :" + y);
		
		//char : ������ ���� Type
		char grade= 'A'; //���ڸ� ����Ͽ����� '' char�� ��� �ѹ��ڸ� �Է� ����.
		System.out.println("��� : "+ grade);
		
		//byte : ������ ���� Type
		byte a = 127; // byte �� ��� ������ 256�̸�, �̸� 2�� ������ ����,��� �� 0 ���� �ϰԵǸ� -128 ~ 127�� ���� ������ �ִ� ����.
		System.out.println("byte : "+ a);
		
		//short : ������ ���� Type
		short b = 32767; //short�� ��� ������ 65,536�̸�, �̸� 2�� ������ ����,��� �� 0 ���� -32,768 ~ 32,767 ������ ������ ǥ������.
		System.out.println("short : "+ b);
		
		//int : ������ ���� Type
		int year = 2147483647; //int �� ������ 4,294,967,296 �̸�,�̸� 2�� ������ ����,��� �� 0 ���� -2,147,483,648 ~ 2,147,483,647 ���� ǥ������.
		System.out.println("���� �⵵ : "+ year);
		
		//long : ������ ����  Type
		long c = 2147483648L; // long�� int ���� ��ū������ ����ϸ�, int���� ������ ���� L�� ���� �ڿ� �ٿ���� �Ѵ�.
		
		//float : �Ǽ��� ���� Type
		float d = 12.31f;
		
		//double : �Ǽ��� ���� Type
		double e = 123.12;
		
		//String : ���� Type
		String name = "ȫ�浿";
		System.out.println("�̸�  : "+ name);
		

		
		
		
	}
}
