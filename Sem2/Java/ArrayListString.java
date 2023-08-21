import java.io.*;
import java.util.ArrayList;
class ArrayListString{
	public static void main(String ar[]){
	int n=5;
	ArrayList<String> st=new ArrayList<>(n);
	for (int i=0;i<=n;i++)
	st.add("Fruit"+i);
	System.out.println(st);
	st.set(1,"apple");
	st.add(2,"orange");
	System.out.println(st);
	st.remove(4);
	System.out.println(st);
	for(int i=0;i<st.size();i++)
	System.out.print(st.get(i)+", ");
	}
}
