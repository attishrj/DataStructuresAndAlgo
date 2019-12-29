package com.java.thread.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {
	final private Queue<Integer> sharedQ;
	int maxSize;

	public Consumer(Queue<Integer> sharedQ, int maxSize) {
		this.sharedQ = sharedQ;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQ) {
				System.out.println("consumer  size is " + sharedQ.size());
				while (sharedQ.isEmpty()) {
					try {
						System.out.println("Queue is empty," + "Consumer thread is waiting"
								+ " for producer thread to put something in queue");

						this.sharedQ.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				int number = (int) sharedQ.poll();
				System.out.println("Consuming values " + number);
				sharedQ.notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		}
	}
}
