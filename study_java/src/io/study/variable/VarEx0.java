package io.study.variable;

/*
 * primitive Type(기본형)
 * 논리형 : boolean
 * 문자형 : char
 * 정수형 : byte, short, int, long
 * 실수형 : float, double
 */
public class VarEx0 {

	public static void main(String[] args) {
		boolean power = true; // true 또는 false 의 값이 저장되며, 대소문자를 구별한다.
		char ch = 'A'; // 하나의 문자를 저장하며, 대문자 A는 유니코드에 의해 65와 같다.
		int number = 65;
		
		if(ch == number) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		System.out.println("char ?? "+ (char)65); //int 65 를 char 로 명시적 형변환을 하였을때. 유니코드값에 의해 표시.
		
		//다음 값을 결과를 예상하여 주석으로 결과및 이유를 작성해 보세요.
		short min = -32768;
		short max = 32767;
		System.out.println(min - 1); //min은 short Type 이지만 1 로인해 int Type으로 자동형변환되어  -32769 로 표시됨. 
		System.out.println(max + 1);
		System.out.println((short)(min-1));
		System.out.println((short)(max+1));
		
		float f = 9.1234567901234567980f;
		double d = 9.12345678901234567890;
		
		System.out.println("float : "+f); //소수점 이하 6째 까지 표시. 7번째 수는 반올림.
		System.out.println("double : "+d);
	}
}
