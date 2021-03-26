package seleniumpracticeJ;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTable {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Jaiprakash", 70000);
		Employee e2 = new Employee(201, "Siri", 60000);
		Employee e3 = new Employee(301, "Nagan", 55000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator<Employee> itr = al.iterator();
		
		while(itr.hasNext()) {
			
			Employee emp = (Employee)itr.next();
			System.out.println(emp.EID +" " + emp.EName+ " " + emp.Esal);
		}


		
	}
	
}
class Employee{
	int EID;
	String EName;
	int Esal;
	
	Employee(int EID, String EName, int Esal) {
		this.EID= EID;
		this.EName= EName;
		this.Esal= Esal;
	}

}
