package activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> list = new ArrayList<>();
		list.add("Gleb");
		list.add("Bob");
		list.add("John");
		list.add("Bob");
		list.add("Henry");
		//2 - Call print method to print the list passed as its parameter.
		print(list);
	}
	
	static void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		for(Object s:list){
			System.out.println(s);
		}
	}
}
