package net.me.dev;

import java.util.Random;

public class Process extends Thread {
	private int processNumber;
	
	public Process() {
		processNumber = (new Random().nextInt(50)+1);
	}
	
	public void run() {
		while(true) {
			
			/*dentro del scope de ejecucion correcto
			 * , duerme al thread por un determinado 
			 * numero de milisegundos*/
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Proceso numero " 
					+ this.processNumber);
		}
	}
}
