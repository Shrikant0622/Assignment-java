package seleniumpracticeJ;

public class TestAudi {

	public static void main(String[] args) {
		
		Audi myAudi = new Audi();
		
	    myAudi.capacity();
		myAudi.speed();
		myAudi.features();
		
		System.out.println("The car has" + myAudi.wheels);
		System.out.println("This car is of" + myAudi.type);

	}

}
