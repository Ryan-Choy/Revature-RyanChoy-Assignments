
public class Address {
	private int aid;
	private String streetname;
	private String city;
	private String state;
	private int zip;

	public Address(int aid, String streetname, String city, String state, int zip) {
		super();
		this.aid = aid;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "\nAddress - [Address id: " + aid + ", Street name: " + streetname + ", City: " + city + ", State: "
				+ state + ", Zip code: " + zip + "]";
	}

}
//present and permanent Address(aid,streetname,city,state,zip)