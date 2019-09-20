package exelparser;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		String src = args[0];
		String dst = args[1];
		ExcelParser xl = new ExcelParser();
		String data = xl.parse(src);
		String [] records = data.split("\n");
		
	}
}
