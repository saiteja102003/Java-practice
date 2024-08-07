package constructor1;

public class A {
public void play() {
	System.out.println("hi i am playing");
}
}
class B {
	public static void main(String args[]) {
	A obj= new A();
	obj.play();
}
}

