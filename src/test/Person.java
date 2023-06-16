package test;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void birthday() {
		age++;
		System.out.println(name + " is now " + age);

	}

	public static void main(String[]args) {
		Person amreel = new Person("Amreel", 24);
		amreel.birthday();
	}

}
