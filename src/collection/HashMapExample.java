package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args)
{
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	 hmap.put(12, "Chaitanya");
     hmap.put(2, "Rahul");
     hmap.put(7, "Singh");
     hmap.put(49, "Ajeet");
     hmap.put(3, "Anuj");
     Set set = hmap.entrySet();
     Iterator iter = set.iterator();
     while(iter.hasNext())
     {
    	 Map.Entry mentry = (Map.Entry)iter.next();
    	 System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
     }
     
     String var = hmap.get(2);
     System.out.println("Value at index 2 is: "+var);
     hmap.remove(3);
     System.out.println("Map key and values after removal:");
     Set set2 = hmap.entrySet();
     Iterator iterator2 = set2.iterator();
     while(iterator2.hasNext()) {
     Map.Entry mentry2 = (Map.Entry)iterator2.next();
     System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
     System.out.println(mentry2.getValue());
     }
     
}
}
