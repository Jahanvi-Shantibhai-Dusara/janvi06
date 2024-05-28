package region;

public class City extends State {

	private String City_name;

	public String getCity_name() {
		return City_name;
	}

	public void setCity_name(String city_name) {
		City_name = city_name;
	}

	@Override
	public String toString() {
		return "Country_name= " + getCname() + "State_name= " + getSname() +" City_name=";
	}
	
	
}
