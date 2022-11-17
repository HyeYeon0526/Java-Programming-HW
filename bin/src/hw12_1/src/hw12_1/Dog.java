//*****************************
//파일명 : Dog.java 
//작성자 : 김혜연 
//작성일 : 2022. 11. 16 
//내용 : 추상메소드 상속 및 메소드 오버라이드 
//*****************************

package hw12_1;

public class Dog extends Animal{ // animal 을 상속하는 클래스 
	double speed;
	
	public Dog (double speed, String name) { 
		this.speed = speed;
		this.name = name;
	}

	@Override
	public String sound() { // 추상클래스 오버라이드 
		return "멍멍 " + name;
	}

	public void newYear() {
		speed += 5;	
		System.out.println(name+" "+ speed + "km");
	}
	
	public String toString() {
		return super.toString() + " 시속 " + (int) speed + "km";
	}
	
	
}
