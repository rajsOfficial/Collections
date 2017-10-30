import java.util.*;

public class Binary_Search {
   public static void main(String args[]) {
	   																				// create arraylist       
   List<String> arlst=new ArrayList<>();
      
   																					// populate the list
   arlst.add("TP");
   arlst.add("PROVIDES");
   arlst.add("QUALITY");
   arlst.add("TUTORIALS");
      
   																					// search the list for key 'QUALITY'
   int index=Collections.binarySearch(arlst, "QUALITY");     
      
   System.out.println("'QUALITY' is available at index: "+index);
   }    
}