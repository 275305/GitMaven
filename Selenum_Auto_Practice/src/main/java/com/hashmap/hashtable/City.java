package com.hashmap.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class City {
	String cityName;

	public City(String cityName) {
		this.cityName = cityName;

	}

	public static void main(String[] args) {

		City city1 = new City("hyderabad");
		City city2 = new City("Kanpur");
		City city3 = new City("Lucknow");
		City city4 = new City("kanpur");

		Hashtable<Integer, City> htable = new Hashtable<Integer, City>();
		htable.put(101, city1);
		htable.put(102, city2);
		htable.put(103, city3);

		for (Map.Entry<Integer, City> m : htable.entrySet()) {

			City c = m.getValue();

			System.out.println(m.getKey() + " " + c.cityName);

		}

	}

}
