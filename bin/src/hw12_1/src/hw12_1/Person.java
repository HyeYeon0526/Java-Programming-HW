//*****************************
//파일명 : Person.java 
//작성자 : 김혜연 
//작성일 : 2022. 11. 16 
//내용 : 추상메소드 상속 및 메소드 오버라이드 
//*****************************


package hw12_1;

public class Person extends Animal { // animal을 상속하는 클래스 
	double age;
	
	public Person (double age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String sound() { // 추상메소드를 오버라이드 
		return "안녕 " + name;
	}

	public void newYear() {
		age++;
		System.out.println(name+" "+(int)age+"세");
	}
	
	public String toString() {
		return super.toString()+ " " + (int)age + "세";
	}
}
