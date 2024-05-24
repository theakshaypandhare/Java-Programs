package Sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CitySortcontrol {
public static void main(String[] args) {
	City c1=new City("banglore", 560078);
	City c2=new City("ujjain", 560078);
	City c3=new City("mumbai", 560078);
	City c4=new City("chattarput", 560078);
	City c5=new City("chennai", 560078);
	City c6=new City("koimbatur", 560078);
	City c7=new City("vishakhapatnam", 560078);
	City c8=new City("vijaywada", 560078);
	City c9=new City("delhi", 560078);
	
	List<City> list=new LinkedList<>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	list.add(c4);
	list.add(c5);
	list.add(c6);
	list.add(c7);
	list.add(c8);
	list.add(c9);
	
	Collections.sort(list);
	
	for (City city : list) {
		System.out.println(city.cityname+" "+city.pincode);
	}
}
}
