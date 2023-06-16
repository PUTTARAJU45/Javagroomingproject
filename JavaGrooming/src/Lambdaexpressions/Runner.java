package Lambdaexpressions;
@FunctionalInterface
interface Amazon{
	void purchase(String product);
}
class Customer implements Amazon{

	@Override
	public void purchase(String product) {
		System.out.println("Purchased Product is "+product);
	}
	
	
}
public class Runner {
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.purchase("Laptop");
		
		Amazon a1=new Amazon() {
			
			@Override
			public void purchase(String product) {
				System.out.println("Purchased Product is "+product);

			}
		};
		a1.purchase("HeadSet");
		
		
		Amazon a2=(product)->System.out.println("Purchased Product is "+product);
		
		a2.purchase("Jaggu");
		
		
		new Amazon() {
			
			@Override
			public void purchase(String product) {
				System.out.println("Purchased Product is "+product);
				
			}
		}.purchase("Jammmunnnnnn");;
		
		
		
		Amazon a3=(product)->System.out.println("Purchased Product is "+product);
		
		a3.purchase("Watch");
		
		
		
	}

}
