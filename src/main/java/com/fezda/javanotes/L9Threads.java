package com.fezda.javanotes;

public class L9Threads {
	
	public static void main (String[] args) {
		// Demo of running simplest thread
		MyBasicThreadClass myThread = new MyBasicThreadClass();
		myThread.start();
		
		// Demo of how thread function can be interrupted in code before completion
		MyInterruptibleThreadClass myIThread = new MyInterruptibleThreadClass();
		myIThread.start();
		myIThread.interrupt();
		
		// Demo of how 2 threads work simultaneously, alternating output from counting at different rates
		Counter1 myCounter1 = new Counter1();
		Counter2 myCounter2 = new Counter2();
		myCounter1.start();
		myCounter2.start();
	}
	
	public static class MyBasicThreadClass extends Thread {
		// Your code goes in the run function
		public void run () {
			System.out.println("Running basic thread");
		}
	}
	
	public static class MyInterruptibleThreadClass extends Thread {
		public void run () {
			try {
				System.out.println("before delay");
				Thread.sleep(1000);							// Pause for 1000 milliseconds
				System.out.println("after delay");
			} catch (InterruptedException e) {				// Accessed if thread object's interrupt method is called
				return;
			}
		}
	}

	
	public static class Counter1 extends Thread {
		public void run () {
			try {
				// Count from 1 to 4, counting every 1/5 second
				for (int i = 1; i < 5; i++) {
					Thread.sleep(200);
					System.out.println("By Counter 1: " + i);
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
	public static class Counter2 extends Thread {
		public void run () {
			try {
				// Count by 10s from 10 to 40, counting every 1/10 second
				for (int i = 1; i < 5; i++) {
					Thread.sleep(100);
					System.out.println("By Counter 2: " + i*10);
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}
