package io.study.variable;

//변수란, 단 하나의 값을 저장 할수 있는 메모리 공간 이다.
/*
 * 변수 명명규칙
 * 1. 대소문자가 구분되며 길이에 제한이 없다.
 * 2. 예약어를 사용해서는 안된다.
 * 3. 숫자로 시작해서는 안된다.
 * 4. 특수문자는 '_' 또는 '$' 만 사용가능 하다.
 * 
 * 클래스 명명 규칙(강제는 아니지만 개발자간의 권장 하는 규칙)
 * 1. 클래스 이름의 첫 글자는 항상 대문자로 시작한다. ex.(Variable)
 * 2. 여러 단어로 이루어진 단어의 첫 글자는 대문자로 시작한다. ex.(VariableExample)
 * 3. 상수의 이름은 모두 대문자로 한다. 여러단어로 이루어진 경우 '_'를 이용한다. ex.(TEST_NUMBER)
 */
public class VarEx1 {

	public static void main(String[] args) {
		int year = 0; // int 타입의 year 라는 이름의 변수를 0으로 초기화 하는 것으로 변수를 사용하기 전에 처음으로 값을 저장 하는것.
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
	}
}
