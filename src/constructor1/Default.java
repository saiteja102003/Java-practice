package constructor1;

public class Default {
	public Default() {
		System.out.println("hii");
	}
public int add(int a,int b) {
	return a+b;
}
public static void main(String args[]) {
	Default obj= new Default();
	System.out.print(obj.add(8,10));
}
}
