package demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Seoul");
		
		for (String t: cities){
			System.out.println(t);
		}
		
		System.out.println("Total number of elements in the list = " + cities.size());
	}

}
