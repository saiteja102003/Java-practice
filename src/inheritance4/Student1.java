package inheritance4;

public class Student1 implements Student,Student2{
	public void play() {
		System.out.println("playing");
	}
	public void run() {
		System.out.println("running");
	}
	public static void main(String args[]) {
		Student1 obj = new Student1();
		obj.play();
		obj.run();
}
	}