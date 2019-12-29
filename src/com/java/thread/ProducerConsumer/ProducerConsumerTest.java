package com.java.thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		
		final Queue<Integer> buffer = new LinkedList<>();
		int maxSize = 5;
		
		Thread pThread=new Thread(new Producer(buffer, maxSize), "Producer ");
		Thread cThread=new Thread(new Consumer(buffer, maxSize), "Consumer ");
		pThread.start();
		cThread.start();


	}

}
