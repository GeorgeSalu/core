package br.com.java6.core;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleDemoOne {
	public static void main(String[] args) {
		Timer timer = new Timer("exam");
		TaskOne task = new TaskOne();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 3);
		Date startTime = calendar.getTime();
		System.out.println("Writing answer...");
		timer.schedule(task, startTime); 
										
		try {
			Thread.sleep(5000); 
								
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			timer.cancel();
			
		}
		System.out.println("Timer stopped.");
	}
}

class TaskOne extends TimerTask {
	@Override
	public void run() {
		System.out.println("Time Up.");
	}
}