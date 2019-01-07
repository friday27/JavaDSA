package module6;

public class LinearSearchEx {
	Airport[] airports = new Airport[8];
	private int size = 0;
	
	public void addAirport(String city, String country, String code3) {
		airports[size] = new Airport(city, country, code3);
		size ++;
	}
	
	public void findAirportCode(String city) {
		boolean found = false;
		for (int i=0; i<size; i++) {
			if (airports[i].getCity() == city) {
				System.out.println("Find "+city+" in airports["+i+"]. Airport code: "+airports[i].getCode());
				found = true;
				break;
			}
		}
		if (found != true) {
			System.out.println(city+" not in airports");
		}
	}

	public static void main(String[] args) {
		LinearSearchEx a = new LinearSearchEx();
		a.addAirport("Taipei", "Taiwan", "TPE");
		a.addAirport("Hong Kong", "Hong Kong", "HKG");
		a.addAirport("London", "United Kindom", "LHR");
		a.addAirport("San Fancisco", "United States", "SFO");
		a.addAirport("Beijing", "China", "PEK");
		a.addAirport("New York", "United States", "LGA");
		a.addAirport("Los Angeles", "United States", "WHP");
		a.addAirport("Osaka", "Japan", "ITM");
		
		a.findAirportCode("Taipei");
		a.findAirportCode("Taichung");

	}

}
