package innerclass;
abstract class Person{
abstract	void eat();
}

class Tom extends Person{
	void eat() {
		System.out.println("TOm is Eating");
	}
}
public class Anonyms {
	public static void main(String[] args) {
		
	
	Tom tom=new Tom();
	tom.eat();
	Person person=new Person() {
		void eat() {
			System.out.println("Eating");
		}
	};
	
	}
}
