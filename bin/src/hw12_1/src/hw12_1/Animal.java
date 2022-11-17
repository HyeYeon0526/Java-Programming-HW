package hw12_1;

//*****************************
//파일명 : Animal.java 
//작성자 : 김혜연 
//작성일 : 2022. 11. 16 
//내용 : 추상메소드 생성 
//*****************************


public abstract class Animal { // 추상 메소드 생성 
	public String name;
	
	public Animal () { // 기본생성자 
	}
	
	public Animal (String name) { // 이름을 매개변수로 받아 초기화하는 생성자 
		this.name = name;
	}

	public String getName() { 
		return name;
	}
	
	public abstract String sound(); // 소리를 출력하는 추상메소드 
	
	public abstract void newYear(); // 한 해가 지날 때마다 할 일을 지정할 추상메소드 
	
	public String toString() {
		return name;
	}


}
