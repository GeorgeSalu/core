package br.com.java6.core;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduleDemoTwo {
	public static void main(String[] args) {
		Timer timer = new Timer("taskthread");
		TaskTwo task = new TaskTwo(1); 
		int startTime = 3; 
		System.out.println("Task will start after " + startTime + " seconds.");
		timer.schedule(task, startTime * 1000, 2000); 
														
														
		try {
			Thread.sleep(15000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			timer.cancel();
		}
		System.out.println("Timer stopped.");
	}
}

class TaskTwo extends TimerTask {
	private int counter;

	public TaskTwo(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println("Counter " + counter++ + ": Doing task...");
	}
}