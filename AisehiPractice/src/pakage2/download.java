package pakage2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class download {
   @SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	  Scanner scanner = new Scanner(System. in);
	  String name = null;
	  System.out.println("Enter the website to dowm load: ");
	  name = scanner.next();
      URL url = new URL(name);
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
      String line;
      
      while ((line = reader.readLine()) != null) {
         System.out.println(line);
         writer.write(line);
         writer.newLine();
      }
      reader.close();
      writer.close();
   }
}