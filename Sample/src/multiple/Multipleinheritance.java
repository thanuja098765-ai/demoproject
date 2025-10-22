package multiple;

public class Multipleinheritance extends Sub {
	public void multiple()
	{
		int multiple=a*b*d;
				System.out.println(multiple);
}
public static void main(String args[])
{
	Multipleinheritance obj=new Multipleinheritance();
	obj.multiple();
	obj.sum();
	obj.subration();
	}
}
