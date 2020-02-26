

public class Person {
	protected String name;
	protected Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return this.getName();
	}
}
