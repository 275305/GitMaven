package com.hashmap.hashtable;

import java.util.HashMap;
import java.util.Map;



public class HashMapEx1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		    map.put(1, "hyd");
		    map.put(2, "Mumbai");
		    map.put(3,"noida");
		    map.put(3, "ban");
		    map.put(null, "kan");
		    map.put(null, "lko");
		    
		    map.put(4, null);
		    map.put(5, null);
		    //System.out.println(map);
		    for(Map.Entry m:map.entrySet()) {
		    	 System.out.println(m.getKey()+" "+m.getValue());
		    }
		    
		    
		    	
	}

}
