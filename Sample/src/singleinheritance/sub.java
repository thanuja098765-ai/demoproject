package singleinheritance;
public class sub extends Inheritancesample
{
	public void sub()
	{
		int d=b-a;
		System.out.println(d);
		}
	public static void main (String args[])
	{
		
		sub obj=new sub();
		obj.inheritance();
		obj.sub();
	}
	

}
