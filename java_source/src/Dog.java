
public class Dog {
	
	String name;
	
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		
	}

	public void bark() {
		System.out.println(name +"test");
	}
	
	public void eat() {}
	public void chaseCat() {}
	
	

}
