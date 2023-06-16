package factrydesignpattern;


class  Person{
	String nameString="abd";
	
}
class Employee extends Person{
	int id=20;
	void work() {
		System.out.println("working");
	}
}
class Student extends Person{
	int age=23;
	void study() {
		System.out.println("Studing");
	}
}



public class solution1 {
static	void display( Person p ) {
		if(p instanceof Employee) {
			Employee e=(Employee)p;
			System.out.println(e.id);
			System.out.println(e.nameString);
			e.work();
		}
		else  if(p instanceof Student){
			Student s=(Student)p;
			System.out.println(s.age);
			System.out.println(s.nameString);
			s.study();
			
		}
		
		
	}
public static void main(String[] args) {
	Employee e=new Employee();
	display(new Student());
	display(e);
}

}
