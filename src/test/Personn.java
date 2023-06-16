package test;

public class Personn {
	String name;
	int age;

	void birthday() {
		this.age++;
		System.out.println(this.name + " is now " + this.age);
	}

	public static void main(String[] args) {
		Personn john = new Personn();
		john.name = "John Smith";
		john.age = 37;
		john.birthday();

		Personn mary = new Personn();
		mary.name = "Mary Brown";
		mary.age = 33;

		mary.birthday();
	}

}
