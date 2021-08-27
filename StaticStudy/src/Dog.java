
public class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating...");
	}
	/*Static method with the same method signature as in super class
	 * since static method can<t be overridden so it is called method hiding*/
	public static void run(){
		System.out.println("Dog is running");
	}

}
