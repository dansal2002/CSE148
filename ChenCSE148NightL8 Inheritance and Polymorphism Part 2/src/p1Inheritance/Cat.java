package p1Inheritance;

public class Cat extends Pet {
	private String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat:\n\t" + super.toString() + ", color=" + color;
	}
	
}
