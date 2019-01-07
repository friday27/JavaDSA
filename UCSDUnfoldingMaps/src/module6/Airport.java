package module6;

public class Airport {
	
	private String city;
	private String country;
	private String code3;
	
	public String getCity() { return this.city; }
	public String getCountry() { return this.country; }
	public String getCode() { return this.code3; }
	
	public Airport() {
		this.city = "default";
		this.country = "default";
		this.code3 = "123";
	}
	
	public Airport(String city, String country, String code3) {
		this.city = city;
		this.country = country;
		this.code3 = code3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
