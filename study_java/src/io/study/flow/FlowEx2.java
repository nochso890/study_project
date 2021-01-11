package io.study.flow;


public class FlowEx2 {

	public static void main(String[] args) {
		
		String name = "김홍순";
		
		switch(name) {
	
		case "고길동" :
			System.out.println("이름이 고길동 입니다.");
			break;
			
		case "홍길동" :
			System.out.println("이름이 홍길동 입니다.");
			break;
			
		case "김길동" :
			System.out.println("이름이 김길동 입니다.");
			break;
        default :
        	System.out.println("해당 이름 없음");
        	break;
		}

		
		
	}
}
