package Sorting;

public class City implements Comparable<City> {
	String cityname;
	long pincode;

	public City(String cityname, long pincode) {
		this.cityname = cityname;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.cityname + " " + this.pincode;
	}

	@Override
	public int compareTo(City o) {

		return this.cityname.compareToIgnoreCase(o.cityname) * -1;

	}
}
