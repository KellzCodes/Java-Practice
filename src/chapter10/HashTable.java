package chapter10;

/**
 * A very simple implementation of a Hash Table DS.
 * 
 */
public class HashTable {
	private static final int TABLE_SIZE = 100;
	private Record[] tableData = new Record[TABLE_SIZE]; // say that we won't get more than 100 records
	
	public void put(Object key, Object value) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (!isEmpty(slot)) {
			slot = hash(keyCode, ++step);
		}
		tableData[slot] = new Record(key, value);
	}
	
	public boolean keyExists(Object key) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
			slot = hash(keyCode, ++step);
		}
		if (tableData[slot] != null) return true;
		return false;
	}
	
	public Object get(Object key) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
			slot = hash(keyCode, ++step);
		}
		if (tableData[slot] != null) return tableData[slot].getData();
		return null;
	}
	
	private int hash(int key, int step) {
		if (step == 0)
			return key % TABLE_SIZE;
		return (key % TABLE_SIZE + step*step) % TABLE_SIZE;
	}
	
	private boolean isEmpty(int slot) {
		return tableData[slot] == null;
	}
	
	private class Record {
		Object key;
		Object data;
		
		public Record(Object key, Object data) {
			this.key = key;
			this.data = data;
		}
		
		public Object getKey() {
			return this.key;
		}
		
		public Object getData() {
			return this.data;
		}
	}
	
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put("4", 40);
		ht.put("6", 60);
		ht.put("7", 70);
		ht.put("8", 80);
		ht.put("9", 90);
		ht.put("5", 50);
		System.out.println(ht.keyExists("2"));
		System.out.println(ht.keyExists("4"));
		System.out.println(ht.get(2));
	}
}
