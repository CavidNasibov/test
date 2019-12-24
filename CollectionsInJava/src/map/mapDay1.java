package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mapDay1 {
public static void main(String[] args) {
	Map <String,String> maps=new HashMap<String,String>();//if you want to use two String,u have specify that as like 
//	maps.put("firstName", "John");//this <String,String>.Or want to use STring,and Integer,write <String,Integer>
//	maps.put("lastName", "Smith");
//	maps.put("age", "35");
//	maps.put("salary", "10000");
//	System.out.println(maps);
//	System.out.println(maps.keySet());//With this way we can run out first Strings(keys)
//	System.out.println(maps.values());//with this we can run out second Strings(values)
//	String salaryMike=maps.get("salary");
//	System.out.println(Integer.valueOf(salaryMike)*12);//with this way u can import string to integer and use that.
//	
//	
//	Map <String,String> maps1=new HashMap<String,String>();
//	maps1.put("firstName", "Borden");
//	maps1.put("age", "45");
//	maps1.put("firstName", "Borden");
//	maps1.put("salary", "12000");
//	System.out.println(maps);
//	System.out.println(maps1);
//	
//	ArrayList <Map> list=new ArrayList<Map>(Arrays.asList());
//	list.add(maps);
//	list.add(maps1);
//	System.out.println(list.get(0));
//	System.out.println(list.get(0).get("firstName"));
//	System.out.println(maps.get("firstName").charAt(0)+ "avid");
//	System.out.println(maps.containsValue("John"));
}
public Map<String, String> mapBully(Map<String, String> map) {
	  if (map.containsKey("a")||map.containsKey("c")) {
		  map.remove("c");
		   map.put("b", map.get("a"));
		 map.put("a", "");
	}return map;
	
	
}
}
