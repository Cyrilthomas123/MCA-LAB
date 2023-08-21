import java.io.*;
class File_Read
{
	public static void main(String ar[])throws IOException{
		String s="";
		try{
			FileReader f1=new FileReader("/home/user/head.txt");
			BufferedReader r=new BufferedReader(f1);
			while((s=r.readLine())!=null){
				System.out.println(s);
				}
				r.close();
			}catch(IOException e){System.out.println(e);
		}
	}
}
		
		
