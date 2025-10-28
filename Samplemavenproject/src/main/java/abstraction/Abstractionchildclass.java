package abstraction;

public class Abstractionchildclass extends Abstractionparentclass {

	public static void main(String[] args) {
		//Abstractionparentclass obj=new Abstractionparentclass();
		Abstractionchildclass obj=new Abstractionchildclass();
		obj.display();
		obj.sum();
		obj.display2();
		
		// TODO Auto-generated method stub

	}
	public void sum()
	{
		int a=5+7;
		System.out.println(a);
	}
	public void display2()
	{
		System.out.println("child class ");
	}

}
