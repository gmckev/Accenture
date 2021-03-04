package activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String,String> map = new HashMap<>();
			map.put("1","Gleb");
			map.put("2","Alex");
			map.put("3","Bob");

			
			//2 - Call print method to print the map passed as its parameter.
			print(map);
		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
			map.forEach((k, v) -> System.out.println(k + " : " + v));

		}
	}
