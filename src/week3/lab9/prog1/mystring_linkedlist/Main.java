package week3.lab9.prog1.mystring_linkedlist;

public class Main {

	public static void main(String[] args) {

		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping...  "+stack.pop());
		System.out.println("Peeking...  "+stack.peek());
		System.out.println("Popping...  "+stack.pop());

	}

}
