package io.study.scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �Է� ���ּ���.");
		String input = scanner.nextLine(); //consloe â�� ���ڸ� �Է� ����.
		
		System.out.println("�Է³��� : "+ input); //�Է��� ���� consoleâ�� �����.
	}
}
