package io.study.casting;

/*
 * Casting(ĳ����)
 * casting�̶� ���� �ٸ� Type ���� ������ �����ؾ� �ϴ� ���,
 * ������ �����ϱ��� Type�� ��ġ��Ű�� ������ ��� �Ѵ�.
 * ���� �Ǵ� ���ͷ��� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϴ� ������ ����ȯ(casting)�̶�� �Ѵ�.
 */
public class CastingEx {
	
	public static void main(String[] args) {
		double d = 128.4;
		int score = (int)d;
		byte b = (byte)score;
		
		System.out.println("score : "+ score);
		System.out.println("double : "+ d);
		System.out.println("byte : "+ b);
		
	}
	

}
