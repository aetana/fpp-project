package day3.prog3;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		// implement
		if (strArray.length <= size())
			resize();
		strArray[size()] = s;
		size++;
	}

	public String get(int i) {
		// implement
		if (i < 0 || i > size)
			return null;
		return strArray[i];
	}

	public boolean find(String s) {
		// implement
		for (String str : strArray) {
			if (str.equals(s))
				return true;
		}

		return false;
	}

	public void insert(String s, int pos) {
		// implement
		if (pos < 0 || pos > strArray.length)
			System.out.println("Invald Pos! Can not Insert!");
		if (strArray.length < size() + 1)
			resize();

		if (pos >= size()) {
			strArray[pos] = s;
			size++;
		} else {
			System.arraycopy(strArray, pos, strArray, pos + 1, size() - pos);
			size++;
		}

	}

	public boolean remove(String s) {
		// implement
		String strNew[] = new String[strArray.length];
		int newIndex = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				for (int j = 0; j < strArray.length; j++) {
					if (j != i) {
						strNew[newIndex] = strArray[j];
						newIndex++;
					}
				}
				strArray = strNew;
				size--;
				return true;
			}
		}
		return false;

	}

	private void resize() {
		// implement
		String strNew[] = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, strNew, 0, size());
		strArray = strNew;
	}

	public String toString() {
		// implement
		String[] printArr = new String[size()];
		int newIndex = 0;
		for (String str : strArray) {
			if (str != null) {
				printArr[newIndex] = str;
				newIndex++;
			}
		}
		return Arrays.toString(printArr);
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);

	}

}
