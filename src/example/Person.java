package example;

public class Person {  // extends Object
	// 변수
	public final String firstName;
	public final String lastName;
	
	// 생성자
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
