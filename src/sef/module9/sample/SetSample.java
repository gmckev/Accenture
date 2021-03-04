package sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		HashSet<String> monthSet = new HashSet();

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false

		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("March"));
		System.out.println(monthSet.add("April"));
		System.out.println(monthSet.add("December"));
		System.out.println(monthSet.add("December"));

		System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		for(String month:monthSet){
			System.out.println(month);
		}
		//You'd notice that duplicate names are not printed. 
	}
}
