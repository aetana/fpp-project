package week3.lab8.prog5.mytable;

public class MyTable {
	private Entry[] entries;
	private static  final int INITAL_SIZE = 26;
	private int count;
	public MyTable() {
		entries = new Entry[INITAL_SIZE];
		count = 0;
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		for(Entry e:entries) {
			if(e.getKey() == c) return e.getValue();
		}
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		entries[count++] = new Entry(c,s);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String output = "";
		for(Entry e:entries) {
			if(e == null ) break;
			output += e.toString() +"\n";
		}
		return output;
	}
	
	
	private class Entry {
		private char key;
		public char getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		private String value;
		Entry(char ch,String str){
			this.key = ch;
			this.value = str;
		}
		
		//returns a String of the form "ch->str" 
		public String toString() {
			String output = key + "->" + value;
			return output;
		}
	}

}