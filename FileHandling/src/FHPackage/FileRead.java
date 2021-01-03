package FHPackage;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException; 

public class FileRead {
		//public static void main(String[] args) throws IOException 
	public void read() throws IOException
		{ 
			int ch; 
			FileReader fr=null; 
			try
			{ 
				fr = new FileReader("MyFile.txt"); 
			} 
			catch (FileNotFoundException fe) 
			{ 
				System.out.println("File not found"); 
			} 
			while ((ch=fr.read())!=-1) 
				System.out.print((char)ch); 
			fr.close(); 
		} 
	} 



