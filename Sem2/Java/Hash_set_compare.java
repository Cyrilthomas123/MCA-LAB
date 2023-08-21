import java.util.*;
public class Hash_set_compare{
public static void main(String ar[]){
	HashSet<String> h_set=new HashSet<String>();
	h_set.add("red");
	h_set.add("green");
	h_set.add("black");
	h_set.add("white");
	HashSet<String>h_set1=new HashSet<String>();
	h_set1.add("red");
	h_set1.add("pink");
	h_set1.add("orange");
	h_set1.add("black");
	HashSet<String>h_set2=new HashSet<String>();
	h_set2.add("red");
	h_set2.add("pink");
	h_set2.add("black");
	h_set2.add("orange");
	HashSet<String>result_set=new HashSet<String>();
	System.out.println("comparing values of h_set with h_set2");
	for (String element : h_set){
	System.out.println(h_set2.contains(element) ? "Yes" : "No");
	}     
	System.out.println(" After comparing h_set1 and h_set2 = "+ h_set1.equals(h_set2));

	boolean check=h_set.equals(h_set2);

	System.out.println(" After comparing h_set and h_set2 = "+check);

     }
}
