package filehandling;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.*;// Import the IOException class to handle errors


public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();

	}
	
    private static void createFileUsingFileClass() throws IOException
    {
    	try {
    			System.out.println("Enter the file name\n");
    			Scanner sc=new Scanner(System.in);
    			String add= "C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\filehandling\\";
    			String S=add.concat(sc.next());
    					 
    	      File myObj = new File(S);
    	      if (myObj.createNewFile()) {
    	        System.out.println("File created Successfully: " + myObj.getName());	
    	        }
    	      else {
    	        System.out.println("File already exists.");
    	      }
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    }


}
