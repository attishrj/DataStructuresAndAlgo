package com.learn.data.structure.stackqueue;

public class Queue {
	
	int capacity;
	int index;  
	int rear;
	int front;
	int ar[];
	public Queue(int capacity) {
		this.capacity = capacity;
		this.ar=new int[capacity];
		this.index=0;
		this.rear=-1;
		this.front=0;
	}
 
	void enque(int data) throws ArrayIndexOutOfBoundsException
	{
		if (index==capacity) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else{
			this.rear=(this.rear+1)%capacity;
			this.ar[rear]=data;
			System.out.println("element at "+rear+" "+ar[rear]);
			this.index++;
		}
	}
	          
	int deque()
	{
		if(index<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int item=ar[front];
		this.front=(this.front+1)%capacity;
		this.index--;
		
		return item;
	}
	public static void main(String[] args) {
		Queue obj=new Queue(5);
		obj.enque(40);
		obj.enque(41);
		obj.enque(42);
		obj.enque(43);
		obj.enque(44);
		//obj.enque(45);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(obj.deque());
		}

		
	}

}
