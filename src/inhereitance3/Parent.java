package inhereitance3;  

class Parent {
	void play() {
		System.out.println("i am parent");
	}

}

class Child1 extends Parent {
	void run() {
		System.out.println("i am child1");
	}
}

class Child2 extends Parent {
	void eat() {
		System.out.println("i am child2");
	}
}
 class Test {
	 public static void main(String args[]) {
		 Child1 obj1 = new Child1();
		 obj1.run();
		 Child2 obj2 = new Child2();
		 obj2.eat();
	 }
 }