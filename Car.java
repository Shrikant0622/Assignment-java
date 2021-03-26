package seleniumpracticeJ;

public class Car {
	
	public String wheels = "4 wheels";
	public String outercover = "Fiber and Steel";
	
	public void speed() {
		System.out.println("highest speed is 280kmph");
	}
	
	public void capacity() {
		System.out.println("Minimum 4 and maximum 7");
	}
	
	public void milage() {
		System.out.println("Milage is bit less");
	}
	
}

class Audi extends Car{
	
	public String type ="Sports car";
	
	public void features() {
		System.out.println("This includes all modern hitech smart features");
	}

}
