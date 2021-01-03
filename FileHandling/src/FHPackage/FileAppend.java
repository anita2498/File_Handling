package FHPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {

	//public static void main(String[]args) throws IOException
	public void append() throws IOException
	{
	    	
	    	FileWriter fw=new FileWriter("MyFile.txt",true); 
			
	    	try (FileWriter f = new FileWriter("MyFile.txt", true); 
	    			BufferedWriter b = new BufferedWriter(f);
	    			PrintWriter p = new PrintWriter(b);)
	    		{
	    			p.println("\nappending text into file");
	    			p.println("This is the 1st appended line");
	    			p.println("This is the 2nd appended line"); 
	    			} catch (IOException i) 
	    			{ 
	    				i.printStackTrace(); 
	    			}
}
}
	    				
