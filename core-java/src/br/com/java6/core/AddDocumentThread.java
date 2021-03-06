package br.com.java6.core;

import java.util.concurrent.BlockingQueue;

public class AddDocumentThread implements Runnable {
	BlockingQueue<Document> bqueue;

	public AddDocumentThread(BlockingQueue<Document> bqueue) {
		this.bqueue = bqueue;
	}

	@Override
	public void run() {
		bqueue.offer(new Document(1, "AFSD"));
		bqueue.offer(new Document(2, "HGTF"));
		bqueue.offer(new Document(3, "FRDE"));
		bqueue.offer(new Document(4, "BGTF"));
		bqueue.offer(new Document(5, "GTGT"));
	}
}