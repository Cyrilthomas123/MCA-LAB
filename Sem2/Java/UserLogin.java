import java.util.*;
class invalid extends Exception{
	invalid(String s){
	super(s);
	}
}


class UserLogin{
public static void main(String ar[]){
	String uname,pass;
	try{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user name");
	uname=sc.next();
	System.out.println("enter password");
	pass=sc.next();
	check(uname,pass);
	}
	catch (invalid e){
		System.out.println("error because of" +e);
		}
	}
	static void check(String uname,String pass) throws invalid
	{
	if (uname.equals("cyril") && pass.equals("123"))
		System.out.println("login success");
	else
		System.out.println("invalid login credentials");
	}
}

