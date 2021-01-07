package io.study.variable;

/*
 * 변수의 타입
 * primitive Type(기본형) : 계산을 위한 실제 값을 메모리에 저장한다.
 * -논리형 : boolean
 * -문자형 : char
 * -정수형 : byte ,short, int, long
 * -실수형 : float, double
 * 
 * reference Type(참조형) : 객체의 주소를 저장한다.
 * - 위의 8개의 기본형을 제외한 나머지 타입.
 * - 참조변수 탑입은 클래스의 이름이다. ex.(Date today = new Date())
 * 
 * constant & literal(상수 & 리터럴)
 * -상수 : 값을 한번 만 저장할 수 있는 공간 (변하면 안되는 값을 정의 할때 사용.)
 * -리터럴 : 그 자체로 값을 의미하는 것.
 */
public class VarEx3 {

	public static void main(String[] args) {
		int year = 2021; // year 는 변수 이며, 2021은 리터럴 이다.
		final int MAX_VALUE = 12; // final 은 불변이라는 뜻이며, MAX_VALUE 는 상수를 뜻한다.
	}
}
