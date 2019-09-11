package wordcount;

import java.io.File;
import java.io.FileInputStream;

public class Word {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		String d = " ";
		if(!(args.length==1)) {
			System.out.println("Invalid Syntax");
			System.exit(0);
		}
		File file1 = new File(args[0]);
		if(!file1.exists()) {
			System.out.println(args[0]+" not found");
			System.exit(0);
		}
		if(!file1.isFile()) {
			System.out.println(args[0]+" is not a file");
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(args[0]);
			char ch = (char)fis.read();
			while(ch!=(char)-1)
			{
				if(ch==d.charAt(0)) {
					a++;
				}
				b++;
				ch = (char)fis.read();
			}
		}
		catch(Exception e) {
			
		}
		System.out.println(a);
	}
}
