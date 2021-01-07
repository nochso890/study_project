package io.study.variable;

//두변수의 값 교환하기.
public class VarEx2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0; //x값을 임시로 저장할 변수 선언
		
		tmp = x; //x의 값을 tmp 에 저장.
		x = y; // y의 값을 x에 덮어쓰기.
		y = tmp; // y 의 값에 x값이 저장되어있는 tmp 값을 덮어쓰기.
		
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		// 문제
		// int Type A 와 B에  A는 30 을 B는 40 으로 초기화 후
		// B 는 A의 값을 가지게하고 A는 B의 값을 가지게 두변수를 교환 하는 로직 과 출력을 아래 작성해 보세요.
		
		
		
	}
}
