package encapsulation;

public class Encapsulation1 {
	private String name;
	private int age;
	public void setdata(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getdata()
	{
		age=age*2;
		System.out.println(name);
		System.out.println(age);
		
		
	}

}
