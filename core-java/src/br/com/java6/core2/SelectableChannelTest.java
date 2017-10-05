package br.com.java6.core2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.StandardProtocolFamily;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.MembershipKey;
import java.util.Enumeration;

public class SelectableChannelTest {
	public static void main(String[] args) throws IOException {
		Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
		NetworkInterface ni = null;

		while (en.hasMoreElements()) {
			ni = en.nextElement();
			System.out.println("Network Interface Name: " + ni.getName());
			break;
		}

		DatagramChannel dmChannel = DatagramChannel.open(StandardProtocolFamily.INET);

		dmChannel.setOption(StandardSocketOptions.SO_REUSEADDR, true);
		dmChannel.bind(new InetSocketAddress(1000));
		dmChannel.setOption(StandardSocketOptions.IP_MULTICAST_IF, ni);

		InetAddress address = InetAddress.getByName("225.4.5.6");

		MembershipKey mkey = dmChannel.join(address, ni);

		System.out.println("MembershipKey: " + mkey);
		System.out.println(mkey.isValid());

		mkey.drop();

		System.out.println(mkey.isValid());
	}

}