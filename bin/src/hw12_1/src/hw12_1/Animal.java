package hw12_1;

public abstract class Animal {
	String name;
	
	public Animal () {

	}
	
	public Animal (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract String sound();
	
	public abstract int newYear();
	
	public String toString() {
		return name;
	}

}
