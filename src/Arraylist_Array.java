import java.util.ArrayList;
 
public class Arraylist_Array {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}
