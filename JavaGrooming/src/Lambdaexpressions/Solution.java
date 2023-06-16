package Lambdaexpressions;
@FunctionalInterface
interface Student{
	void studing();
	}


@FunctionalInterface
interface Employee{
	void Work(String name,String loc);
	
}
public class Solution {
	public static void main(String[] args) {
		Student s=()->{
			System.out.println("ALl Student Studing");
		};
		
		s.studing();
		Employee e=(name,loc)->{
			System.out.println(name+" is working in "+loc);
		};
		e.Work("john", "powersystem");;
		
	}
	

}
