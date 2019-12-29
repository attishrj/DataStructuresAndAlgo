package com.java.thread.ProducerConsumer;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
 final	private Queue<Integer> shareq;
	private int maxSize;

	public Producer(Queue<Integer> shareq, int maxSize) {
		this.shareq = shareq;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		// while(true)
		{
			System.out.println(" producer size is " + shareq.size());
			synchronized (shareq) {
				while (shareq.size() == maxSize) {
					try {
						System.out.println("Queue is full, " + "Producer thread waiting for "
								+ "consumer to take something from queue");

						shareq.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				Random random = new Random();
				int number = random.nextInt();
				System.out.println("Producing values " + number);
				shareq.add(number);
				shareq.notify();
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
