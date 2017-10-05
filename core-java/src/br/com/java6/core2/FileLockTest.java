package br.com.java6.core2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {
	public static void main(String[] args) throws IOException {

		FileInputStream fin = null;
		FileChannel fchannel = null;

		fin = new FileInputStream("C:/temp/test.txt");


		fchannel = fin.getChannel();


		FileLock lock1 = fchannel.lock(10, 100, true);
		System.out.println(lock1.isShared());


		FileLock lock2 = fchannel.tryLock(201, Long.MAX_VALUE, false);
		System.out.println(lock2.isShared());

		lock1.release();
		lock2.release();

		fchannel.close();
	}
}