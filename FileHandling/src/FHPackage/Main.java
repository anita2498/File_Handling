package FHPackage;

import java.io.IOException;

public class Main {
	  public static void main(String[] args) throws IOException {
		  FileRead a= new FileRead();
		  FileWrite b= new FileWrite();
		  FileAppend c= new FileAppend();
		  
		  b.write();
		  c.append();
		  a.read();
		  
		 System.out.println("Operations successfully completed");
	  }

}
