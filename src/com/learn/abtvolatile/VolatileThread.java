package com.learn.abtvolatile;

public class VolatileThread extends Thread {
	private VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		int oldValue = data.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId()
                + "]: Old value = " + oldValue);
        data.incrCounter();
        int newValue = data.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId()
                + "]: New value = " + newValue);
	}

}
