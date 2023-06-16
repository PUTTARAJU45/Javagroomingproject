package innerclass;



interface Calculator{
	void add(int a,int b);
	int mul(int a,int b);
}
public class Solution {
	public static void main(String[] args) {
		
		Calculator c=new Calculator()
		{
		public void	 add(int a,int b) {
				System.out.println(a+b);
			}
	
			public int mul(int a,int b) {
				return a*b;
			}
			
		};
		
		c.add(25, 45);
System.out.println(c.mul(4, 23));		
		
		
	}
	

}
