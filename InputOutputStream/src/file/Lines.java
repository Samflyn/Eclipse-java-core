package file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Lines {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Invalid Syntax : java Lines <file>");
			System.exit(0);
		}
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File does not exists");
			System.exit(0);
		}
		if (!file.isFile()) {
			System.out.println("Path specified is not a file");
			System.exit(0);
		}
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				String[] fields = record.split(":");
				System.out.println(fields);
				record = dis.readLine();
			}
			dis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
	}
}
