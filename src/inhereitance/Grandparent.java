package inhereitance;

public class Grandparent {
	public void play() {
		System.out.println("i am playing");
	}

}
class Father extends Grandparent{
	public void eat() {
		System.out.println("i am eating");
	}
	
}
class Son{
	public static void main(String args[]) {
		Father obj = new Father();
		obj.eat();
		
	}
	
}
