package inhereitance2;





class Grandparent2 {
	void play() {
		System.out.println("i am grandparent");
	}
}


class Father extends Grandparent2 {
	 void eat() {
		System.out.println("i am father");
	}
	
}
class Son extends Father {
	 void run() {
		System.out.println("i am son");
	}
}
class Test {
	public static void main(String args[]) {
		Son obj = new Son();
		obj.eat();
		obj.run();
		obj.play();
		
	}
	
}

