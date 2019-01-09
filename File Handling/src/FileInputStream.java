import java.io.*;

public class FileInputStream {

	public static void main(String[] args) throws IOException {
		
		int i;
		java.io.FileInputStream fin;
		fin = new java.io.FileInputStream("D:\\Workspace\\Files\\name1.txt");
		
		do {
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		} while (i!=-1);
		fin.close();
	}

}
