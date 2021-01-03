package FHPackage;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	
	  
	  //public static void main(String[] args) throws IOException 
	public void write() throws IOException
	  { 
		  String str ="File Handling in Java Project by Simplilearn"; 
		  FileWriter fw=new FileWriter("MyFile.txt"); 
		  for (int i = 0; i < str.length(); i++)
			  fw.write(str.charAt(i));
		  	  System.out.println("Writing successful");
		  	  fw.close(); 
		  	  }
}
	 

	