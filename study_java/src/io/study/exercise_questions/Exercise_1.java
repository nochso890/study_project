package io.study.exercise_questions;

//다음 연산의 결과를 적으세요.
public class Exercise_1 {

	public static void main(String[] args) {

		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		//다음 출력 결과를 주석으로 적으세요.
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x >2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <='Z'));
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
	}
}
