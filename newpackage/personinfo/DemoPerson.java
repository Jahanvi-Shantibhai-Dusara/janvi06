package tnsif.newpackage.personinfo;
import tnsif.newpackage.countryinfo.*;

public class DemoPerson {

	public static void main(String[] args) {
		
		Country c = new Country("India");
		State s = new State("Gujarat");
		Person p = new Person("Janvi",c,s,25,100000);
		
		TaxCalculation t = new TaxCalculation();
		t.calculateTax(p);
		
		
		
		System.out.println(p);
	}

}
