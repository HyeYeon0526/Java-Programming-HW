//*****************************
//파일명 : main.java 
//작성자 : 김혜연 
//작성일 : 2022. 11. 16 
//내용 : 배열생성 및 메소드 실행 
//*****************************


package hw12_1;

public class main {

	public static void main(String[] args) {
		System.out.println("hw12_1 : 김혜연");
		
		Animal[] anm = new Animal[4]; // 객체로 배열 생성 
		
		anm[0] = new Dog(13.5,"진돌이"); // 배열마다 값 대입 
		anm[1] = new Dog(12.5,"진순이");
		anm[2] = new Person(20,"홍길동");
		anm[3] = new Person(25,"박길동");
		
		for(int i = 0; i < anm.length; i++) { // 원소들의 정보 출력 
			System.out.println(anm[i]);
		}
		
		for(int i = 0; i < anm.length; i++) { // 원소들의 sound 출력 
			System.out.println(anm[i].sound());
		}
		
		System.out.println("-----------1년 후-----------"); // 1년 후의 값 출력 
		for(int i = 0; i < anm.length; i++) {
			anm[i].newYear();
		}
		System.out.println("-----------2년 후-----------");
		for(int i = 0; i < anm.length; i++) { // 2년 후의 값 출력 
			anm[i].newYear();
		}

		
	}

}
