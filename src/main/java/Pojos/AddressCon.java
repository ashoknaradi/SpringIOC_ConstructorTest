package Pojos;

public class AddressCon {
	private String city;
	private String state;
	private String country;

	public AddressCon(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		System.out.println("Parameterized AddressCon class Constructor Called");
	}

	@Override
	public String toString() {
		return "AddressCon [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
