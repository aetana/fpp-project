package week3.lab9.prog1.mystring_linkedlist;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		String s = list.get(0);
		if(!list.remove(0)) return null;
		return s;
	}
	public String peek() {
		//implement
		return list.get(0);
	}
	
	public void push(String s) {
		//implement
		list.insert(s, 0);
	}
}
