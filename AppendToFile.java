package filehandling;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendToFile {

	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\filehandling\\filename.txt", true); 
			 BufferedWriter b = new BufferedWriter(f); 
			 PrintWriter p = new PrintWriter(b);)
		    {p.println("appending text into file");
		System.out.print("append Successfully");}
		
		catch (IOException i)
		{ i.printStackTrace();
		  System.out.print("Error occured");}


	}

}
