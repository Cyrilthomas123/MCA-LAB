import java.io.*;
class File_Write{
	public static void main(String ar[])throws IOException{
		try{
			InputStreamReader r=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(r);
			System.out.println("enter the string");
			String str=br.readLine();
			FileWriter f=new FileWriter("/home/user/head.txt");
			BufferedWriter wr=new BufferedWriter(f);
			wr.write(str);
			wr.close();
		System.out.println("Sucessfully written to the file");
		}catch (IOException w){System.out.println(w);
		}
	}
}
