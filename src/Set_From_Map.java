import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Set;


public class Set_From_Map{
   public static void main(String args[]) { 
	   																// create map
   Map<String, Boolean> map1 = new WeakHashMap<String, Boolean>();

   																	// create a set from map
   Set<String> set = Collections.newSetFromMap(map1); 
      
   																	// add values in set
   set.add("Java"); 
   set.add("C");
   set.add("C++");
      
   																	// set and map values are
   System.out.println("Set is: " + set);
   System.out.println("Map is: " + map1);
   }
}	