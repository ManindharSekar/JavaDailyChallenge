package com.java_programs;

class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception caught");
			}
		}
		System.out.println("Got:" + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception caught");
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put:" + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (true) {
			q.put(i++);
		}

	}

}

class Consumer implements Runnable {
	Q q;

	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			q.get();
		}

	}

}

public class ProducerConsumer {

	// Program: IMPLEMENT PRODUCER CONSUMER DESIGN PATTERN IN JAVA USING WAIT,
	// NOTIFY AND NOTIFY ALL
	// Day: 16
	// Added on: 8-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop");

	}

}
