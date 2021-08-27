
public class ClientTest {
	public static void main(String[] args) {
		Animal animal=new Dog();
		
		/*animal reference currently holding an object of subclass
		 * then child class overridden method will be call*/
	
		animal.eat();
		/*It will call parent class method
		 * dont forgot that static method cannot be overridden*/
		
		animal.run();
		/*parent class and child class have the same method then parent class method will be hide
		 * it is called method hiding*/
		Dog.run();
		
	}
}
