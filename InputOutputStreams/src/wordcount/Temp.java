package wordcount;

import java.io.File;
import java.io.FileInputStream;

public class Temp {
	public static void main(String[] args) {
		File file1 = new File(args[0]);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(args[0]);
			char ch = (char)fis.read();
			while(ch!=(char)-1)
			{				
				ch = (char)fis.read();
				System.out.println(ch);
			}
		}
		catch(Exception e) {
			
		}		
	}
}
