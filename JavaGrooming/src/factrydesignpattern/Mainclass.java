package factrydesignpattern;

import java.util.Scanner;

class Milk{
	
}
class Coffee extends Milk{
	
}
class Tea extends Milk{
	
}
class BadamMilk extends Milk{
	
}

class ElectricStove{
Milk	prepareAny(int choice){
	if(choice==1) {
		Coffee c=new Coffee();
		return c;
	}else if(choice==2) {
		Tea t=new Tea();
		return t;
	}else if(choice==3) {
		BadamMilk b=new BadamMilk();
		return b;
	}
	else {
		return null;
	}
		
	}
	
}
public class Mainclass {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1:Coffee ,Enter 2:Tea ,Enter 3:Badammilk");
	int choice=scan.nextInt();
	
	ElectricStove es=new ElectricStove();
	Milk m=es.prepareAny(choice);
	
	
	if(m instanceof Coffee) {
		System.out.println("Coffe is prepared");
	}
	else if(m instanceof Tea) {
		System.out.println("Tea is prepared");
	}else if (m instanceof BadamMilk) {
		System.out.println("BadamMilk is Prepared");
		
	}else {
		System.out.println("Invalid Choice");
	}
	
	
	
	

}
}
