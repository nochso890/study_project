package io.study.printf;

//형식화된 출력
//printf 는 지시자를 통해 변수의 값을 여러가지 형식으로 출력 한다.
public class PrintfEx1 {

	public static void main(String[] args) {
		/*
		 * 지시자의 종류 및 설명
		 * %b : boolean 값을 나타낼때 사용
		 * %d : 10진수 
		 * %o : 8진수
		 * %x, %X : 16진수
		 * %f : 10진수(실수)
		 * %e, %E : 지수형태표현
		 * %c : 문자(character)
		 * %s : 문자열(String)
		 */
		float floatPie = (float)123.123456789; //명시적 형변환
		double doublePie = 123.123456789;
		
		System.out.printf("등급평가 점수 : %c%n",'A');
		System.out.printf("시험점수 : %d%n",100);
		System.out.println("float : "+ floatPie);
		System.out.println("double : "+ doublePie);
		System.out.printf("float_pirntf : %f, %e, %g%n",floatPie,floatPie,floatPie);
		System.out.printf("double_printf : %.3f, %e, %g%n",doublePie,doublePie,doublePie); // %f의 .3 은 소수점 아래3자리까지만 표기의미
	}
}
