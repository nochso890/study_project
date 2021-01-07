package io.study.variable;

/*
 * 변수란?
 * 단 하나의 값을 저장할 수 있는 메모리공간.
 */

/*
 * JAVA Protgrammer 권장 규칙
 * 1. 클래스 이름의 첫 글자는 항상 대문자로 한다. (Variable)
 * 2. 여러 단어로 이루어진 경우 단어의 첫글자 들을 대문자로 한다.(VariableExample)
 * 3. 상수의 이름은 모두 대문자로 하며, 여러단어의 경우 '_'로 구별한다.(ex. TEST_NUMBER)
 */
public class VarEx1 {
	/* 
	 * 변수의 명명 규칙
	 * 1. 대소문자가 구분되며 길이에 제한이 없다.
	 * 2. 예약어를 사용해서는 안된다.
	 *   -예약어란 KeyWord 또는 Reserved Word 라고 하며, 프로그래밍 구문에 사용되는 언어이다.
	 * 3. 숫자로 시작해서는 안된다.
	 * 4. 특수문자는 '_' 와 '$'만을 허용한다.
	 */

	public static void main(String[] args) {
		
		//boolean : 논리형 변수 Type
		//y : 변수 명
		boolean y = true; //변수초기화란, y라는 이름의 변수를 사용하기 전에 초기화 하는것.
		System.out.println("y 값은 :" + y);
		
		//char : 문자형 변수 Type
		char grade= 'A'; //숫자를 사용하였지만 '' char의 경우 한문자만 입력 가능.
		System.out.println("등급 : "+ grade);
		
		//byte : 정수형 변수 Type
		byte a = 127; // byte 의 경우 범위가 256이며, 이를 2로 나누면 음수,양수 및 0 포함 하게되면 -128 ~ 127의 값을 넣을수 있는 범위.
		System.out.println("byte : "+ a);
		
		//short : 정수형 변수 Type
		short b = 32767; //short의 경우 범위가 65,536이며, 이를 2로 나누면 음수,양수 및 0 포함 -32,768 ~ 32,767 까지의 정수로 표현범위.
		System.out.println("short : "+ b);
		
		//int : 정수형 변수 Type
		int year = 2147483647; //int 의 범위는 4,294,967,296 이며,이를 2로 나누면 음수,양수 및 0 포함 -2,147,483,648 ~ 2,147,483,647 까지 표현범위.
		System.out.println("현재 년도 : "+ year);
		
		//long : 정수형 변수  Type
		long c = 2147483648L; // long은 int 보다 더큰범위에 사용하며, int와의 구분을 위해 L을 숫자 뒤에 붙여줘야 한다.
		
		//float : 실수형 변수 Type
		float d = 12.31f;
		
		//double : 실수형 변수 Type
		double e = 123.12;
		
		//String : 변수 Type
		String name = "홍길동";
		System.out.println("이름  : "+ name);
		

		
		
		
	}
}
