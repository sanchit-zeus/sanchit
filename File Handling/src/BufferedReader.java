import java.io.*;

public class BufferedReader {

	public static void main(String[] args) throws IOException {
		int ch;
		String s1;
		char []s=new char[20];
		
		java.io.BufferedReader bf=new java.io.BufferedReader(new FileReader("D:\\Workspace\\Files\\name1.txt"));
		
//		while((ch=bf.read())!=-1) {
//			System.out.print((char)ch);
//		} //used for reading characters
		
//		while((s1=bf.readLine())!=null) {
//			System.out.println(s1);
//		}this reads line
		
		bf.read(s,0,15);
			System.out.print(s);
 
		bf.close();
	}
}
