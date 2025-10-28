package interfacepackage;

public class Interfacechild1 implements Interfaceparent {

	public static void main(String[] args) {
		Interfaceparent obj=new Interfacechild1();
		obj.display();
		//obj.show();
		// TODO Auto-generated method stub

	}
	public void display()
	{
	System.out.println("Interface example");
}
	public void show() {
		System.out.println("Interface package");
	}

}
