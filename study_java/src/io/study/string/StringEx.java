package io.study.string;

public class StringEx {

	public static void main(String[] args) {
		String name = "홍" + "길동";
		String nameAndHeight = name + 180.6;
		
		//문제 실행해보기 전 예상되는 출력 값을 아래와 같이 주석으로 달아보세요.
		System.out.println("이름 : "+name); // 홍길동
		System.out.println("이름과 키 :"+ nameAndHeight);
		System.out.println(100 + " ");
		System.out.println(" " + 100);
		System.out.println(100 + "");
		System.out.println("" + 100);
		System.out.println("" + "");
		System.out.println(100 + 100 + "");
		System.out.println("" + 100 + 100);
	}
}
