package hw12_1;

public class Dog extends Animal{
	double speed;
	
	public Dog (double speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	@Override
	public String sound() {
		return "멍멍" + name;
	}

	@Override
	public int newYear() {
		return "-------------" + year + "년 후------------";
		
	}
	
	public String toString() {
		return super.toString() + "시속" + speed + "km";
	}
	
	
}
