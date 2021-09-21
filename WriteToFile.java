package filehandling;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
    	String g="C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\filehandling\\filename.txt";
      FileWriter myWriter = new FileWriter("C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\filehandling\\filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough to learn new skills daily.!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
