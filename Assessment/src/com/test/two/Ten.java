package com.test.two;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Ten {
	public static void main(String[] args) throws IOException {

		File file = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		StringBuffer sb = new StringBuffer();
		TreeSet<String> ts = new TreeSet<String>();
		Map<String, Integer> mp=new HashMap<String, Integer>();
		try {
			file = new File(args[0]);
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String line = dis.readLine();
			while (line != null & !line.isEmpty()) {
				sb.append(line.toLowerCase());
				sb.append(" ");
				line = dis.readLine();
			}
			String[] split = sb.toString().split(" ");
			for(int j=0;j<split.length;j++) {
				ts.add(split[j]);
			}
			for (int i = 0; i < split.length; i++) {
				for (int j = i + 1; j < split.length; j++) {
					if (split[i].equals(split[j])) {
						
					}
				}
			}
			System.out.println("Distinct words are : ");
			System.out.println(ts);
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
