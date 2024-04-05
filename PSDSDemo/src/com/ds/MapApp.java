package com.ds;

import java.util.HashMap;
import java.util.Map;

public class MapApp {

	public static void main(String[] args) {
		 Map<Integer,String> map = new HashMap<>();
		 map.put(1,"harry");
		 map.put(2,"ronald");
		 map.put(3,"hermione");
		 
		 System.out.println(map); //{1=harry, 2=ronald, 3=hermione}
		 
		 System.out.println(map.get(2)); //ronald
	}

}
