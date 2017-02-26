package net.me.dev;

import java.util.Random;

public class Task implements Runnable {

	private int processNumber;
	
	public Task() {
		this.processNumber = (new Random().nextInt(50)+1);
	}
	
	@Override
	public void run() {
		//mientras el thread no sea interrumpido
		while(!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Tarea numero "+ this.processNumber);
		}
	}
}
