package example;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("준영", "윤");
		
		// Object 최상위 클래스, 모든 클래스의 부모 클래스
		//Object object = new Object();
		
		System.out.println(person.toString());
		System.out.println(person);  // println 메소드 내부적으로 toString 메소드가 호출됨
	}
}
