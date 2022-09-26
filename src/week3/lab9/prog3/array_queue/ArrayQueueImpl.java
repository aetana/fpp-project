package week3.lab9.prog3.array_queue;

import java.util.Arrays;

public class ArrayQueueImpl {
	private static final int INT_LEN = 10;
	private int[] arr = new int[INT_LEN];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
		 
	 public int size() {
		 return size;
	 }
	 
	 public void enqueue(int data) {
		 if(size == arr.length) {
			 arr = Arrays.copyOf(arr, arr.length*2);
		 }
		 if(front == -1) front = 0;
		 arr[rear++] = data;
		 size++;
	 } 
	 
	 public int dequeue() {
		 if(isEmpty()) 
			 throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		 int ret = arr[front];
		 while(front < size ) {
			 arr[front] = arr[front++];
		 }
		 front = 0;
		 rear--;
		 size--;
		 return ret;
		 
	 }
	 
	 public int peek() {
		 if(isEmpty()) 
			 throw new IllegalStateException("Cannot peek because Queue is empty!");
		 return arr[front];
	 }
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

