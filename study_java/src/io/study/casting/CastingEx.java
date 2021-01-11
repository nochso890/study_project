package io.study.casting;

/*
 * Casting(캐스팅)
 * casting이란 서로 다른 Type 간의 연산을 수행해야 하는 경우,
 * 연산을 실행하기전 Type을 일치시키는 행위를 얘기 한다.
 * 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 과정을 형변환(casting)이라고 한다.
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
