import java.io.*;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Workspace\\Files\\name1.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("File exists: "+f1.exists());
		System.out.println("File size: "+f1.length());
		System.out.println("File name: "+f1.getName());
		System.out.println("File can read: "+f1.canRead());
		System.out.println("File can write: "+f1.canWrite());
//		f1.delete();
		System.out.println("File exists: "+f1.exists());
	}
}