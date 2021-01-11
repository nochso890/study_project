package io.study.flow;

public class FlowEx1 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 65;
		char d = 'A';

		if (a == 2) {
			System.out.println("A는 1입니다.");
		}else if(a == b){
			System.out.println("A는 B와 같다");
		}else if(a == c) {
			System.out.println("A는 C와 같다");
		}else if(a == d) {
			System.out.println("A는 D와 같다");
		}else {
			System.out.println("모두 같지 않다.");
		}



	}

}
