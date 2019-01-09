import java.io.*;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		BufferedWriter bf;
		bf= new BufferedWriter(new FileWriter("D:\\Workspace\\Files\\name1.txt",true));
		bf.write(" Computer");
		bf.close();

	}

}
