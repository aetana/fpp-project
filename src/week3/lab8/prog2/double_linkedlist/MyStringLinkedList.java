package week3.lab8.prog2.double_linkedlist;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// inserts a new Node containing data so that its
	// position in the list is now pos
	public void insert(String data, int pos) {
		if (pos < 0) {
			throw new IllegalArgumentException("Illegal positionfor new node");
		}
		if (pos == 0) {
			addFirst(data);
			return;
		}
		Node current = header.next;
		int posCurrent = 0;
		while (current != null) {
			if (pos == posCurrent) {
					Node n = new Node(data);
					n.next = current;
					n.previous = current.previous;
					current.previous.next = n;
					
					break;
			} else if (current.next == null && pos == posCurrent + 1) {
				addLast(data);
				break;
			} else if (current.next == null && pos != posCurrent + 1) {
				throw new IllegalArgumentException("Illegal positionfor new node");
			}
			posCurrent++;
			current = current.next;
		}
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		Node current = header;
		while (current.next != null) {
			if(current.next.value.equals(data)) {
				if(current.next.next != null) {
					Node temp = current.next;
					current.next = temp.next;
					temp.next.previous = current;
					temp = null;
					return true;
				}
				if(current.next.value.equals(data)) {
					removeLast();
					return true;
				}
			}
			current = current.next;
		}
		return false;
	}
	/******* sorting methods ********/
	public void minSort(){
		//implement
		if(header == null || header.next.next == null) return;
		//int len = size;
		Node current = header;
		Node nextMinNode;
		while(current.next != null) {
			nextMinNode = minNode(current.next);
			swap(current.next, nextMinNode);
		}
	}
	void swap(Node n1, Node n2) {
		//implement
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public Node minNode(Node n) {
		//implement
		Node current = n;
		while(current != null) {
			
			current = current.next;
		}
		String m = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i].compareTo(m) < 0){ 
				m = strArray[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}

	/********* end sorting methods ********/
	
	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
//		list.insert("Aman", 0);
//		System.out.println(list);
		list.insert("Etana", 0);
		System.out.println(list);
		list.insert("Roro", 2);
		System.out.println(list);
		list.insert("Etana", 5);
		System.out.println(list);
		list.remove("Etana");
		System.out.println(list);
		list.remove("Etana");
		System.out.println(list);
		list.remove("Roro");
		System.out.println(list);
	}
}
