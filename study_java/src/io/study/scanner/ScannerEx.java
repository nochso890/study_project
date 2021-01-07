package io.study.scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력 해주세요.");
		String input = scanner.nextLine(); //consloe 창에 숫자를 입력 받음.
		
		System.out.println("입력내용 : "+ input); //입력한 값을 console창에 출력함.
	}
}
