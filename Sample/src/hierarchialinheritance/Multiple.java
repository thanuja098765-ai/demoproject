package hierarchialinheritance;

public class Multiple extends Sum {
	public void multiple()
	{
		int Sub=b*a;
		System.out.println(Sub);
	}
	public static void main(String args[])
	{
		Multiple obj=new Multiple();
		obj.multiple();
	}
	

}
