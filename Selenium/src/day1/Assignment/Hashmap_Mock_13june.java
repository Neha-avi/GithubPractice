package day1.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_Mock_13june {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		 map.put(1,"Neha"); 
		 map.put(2, "Kaware");
		 map.put(3, "Accleration");
		 map.put(4, "13_June");
		 map.put(5,"Group G");
		 
		
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());     
		   }  
//		   Collection<Integer> mapp = map.keySet();
//		   System.out.println("All the keys of HashTable....");
//		   System.out.println(mapp);
		   
		   Collection<String> mappp = map.values();
		   System.out.println("All the keys of HashTable....");
		   System.out.println(mappp);
		   
		  map.clear();
		}  
		

}
