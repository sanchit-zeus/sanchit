import java.io.*;

public class FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		java.io.FileOutputStream fout;
		fout=new java.io.FileOutputStream("D:\\Workspace\\Files\\name1.txt", true);
		
		String s="TATA";
		char ch[]=s.toCharArray();
		for (int i = 0; i < s.length(); i++)
			fout.write(ch[i]);
		
		fout.close();
		

	}
}
