//*****************************
//파일명 : Driver.java
//작성자 : 김혜연
//작성일 : 2022.11.16
//내용 : 무명클래스 이용하는 연습 
//*****************************

package hw12_2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_2 : 김혜연 ");
		
		Speakable spk = new Speakable() { // 객체 생성과 동시애 클래스 구현 
			
			private int number = 3;	// speak()에서 사용할 변수 선언 

		    public void dogSpeak() { // "멍멍"을 출력하기 위한 메소드 생성 
		    	System.out.println("멍멍");
		    }
		    
		    public void speak() { // 알람소리를 출력하기 위한 메소드 생성 
				for (int i=0; i<number; i++)
					System.out.print("삐");
			    System.out.println();
			    number = number + 3;
		    }
		    
		};
		
		spk.dogSpeak();
		spk.speak();
	    spk.speak();

	}

}
