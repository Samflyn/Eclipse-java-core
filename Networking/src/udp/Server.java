package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class Server {
	public static void main(String[] args) {
		int count = 0;
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress local = InetAddress.getLocalHost();
			while (true) {
				Date date = new Date();
				String str = date.toString();
				count++;
				if (count % 2 == 0) {
					byte[] b = str.getBytes();
					DatagramPacket dp = new DatagramPacket(b, b.length, local, 1234);
					ds.send(dp);
					Thread.sleep(2000);
				} else {
					byte[] b = str.getBytes();
					DatagramPacket dp = new DatagramPacket(b, b.length, local, 1235);
					ds.send(dp);
					Thread.sleep(2000);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
