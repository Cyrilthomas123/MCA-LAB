import java.io.*;
import java.util.ArrayList;
class ArrayListEx{
public static void main(String ar[]){
	int n=5;
	ArrayList<Integer> arr=new ArrayList<Integer>(n);
	for(int i=0;i<n;i++)
	arr.add(i*i+5);
	System.out.println(arr);
	arr.remove(3);
	System.out.println(arr);
	arr.remove(2);
	for(int i=0;i<arr.size();i++)
	System.out.println(arr.get(i)+"");
	}
}
