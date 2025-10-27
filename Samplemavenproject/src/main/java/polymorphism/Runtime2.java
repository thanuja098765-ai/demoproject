package polymorphism;

public class Runtime2 extends Runtimepolymorphism{
public void display()
{
	super.display();
	System.out.println("child class");
}
public static void main (String args[]) {
	Runtime2 obj=new Runtime2();
	obj.display();
}
}
