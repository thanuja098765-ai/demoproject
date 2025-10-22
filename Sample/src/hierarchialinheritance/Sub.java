package hierarchialinheritance;

public class Sub extends Sum {
	public void subration()
	{
		int Sub=b*a;
		System.out.println(Sub);
	}
	public static void main(String args[])
	{
	Sub obj=new Sub();
	obj.total();
	obj.subration();
	
	}
	

}
