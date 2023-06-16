package factrydesignpattern;


class Food{
	
	
}
class Biryani extends Food{
	
	
}
class CurdRice extends Food{
	
}
class FriedRice extends Food{
	
	
}
class Hotel{
Food orderfood(int choice){
	
	if(choice==1) {
		Biryani b=new Biryani();
		return b;
	}else if(choice==2) { 
		FriedRice f=new FriedRice();
		return f;
	}
	else if(choice==3) {
		CurdRice c=new CurdRice();
		return c;
	}
	
	else {
		return null;
	}
		
	}
}
 class Solution {
	public static void main(String[] args) {
		
	
	Hotel h=new Hotel();
	Food g=h.orderfood(3);
	
	
	
//	Food b=hotel.orderfood(1)-->Food b=new Biryani();
//	Food b=hotel.orderfood(2)-->Food b=new FriedRice();
//	Food b=hotel.orderfood(3)-->Food b=new CurdRice();
//	Food b=hotel.orderfood(4)-->Food b=new null();
	
	if(g instanceof Biryani) {
		System.out.println("Eating Biryani");
	}
	else if(g instanceof FriedRice) {
		System.out.println("Eating FriedRice");
	}
	else  if (g instanceof CurdRice){
		System.out.println("Eating CurdRice");
	}
	else {
		System.out.println("Invalid Choice");
	}
	}
// Factory designing Pattern is a Method returning different types of object by having generalized return type
}
