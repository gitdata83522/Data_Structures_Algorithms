package assignment5.ques3;

public class Program3 {
	
	public static void main(String[] args) {
		HashTable h= new HashTable(10);
		
		h.put("The");
		h.put("hello");
		h.put("the");
		h.put("The");
		h.printWordCounts();
	}

}

class HashTable {
	static class Entry{
		private String key;
		private int count;
		
		public Entry(String key, int count) {
			this.key = key;
            this.count =count;
		}

		public String getKey() {
			return key;
		}
	
		public int getCount() {
			return count;
		}
	}
	
	private Entry arr[];
	private final int size;
	public HashTable(int size) {
		this.size = size;
		arr = new Entry[size];
	}
	
	public int h(String key) {
		return Math.abs(key.hashCode()%size);
	}

	
	public void put(String key) {
		int slot = h(key);
		int index = slot;
		while(arr[slot] != null) {
			if(arr[slot].key.equals(key)) {
				arr[slot].count++;
				return;
			}
			slot = (slot + 1) % size;
            if(slot == index)
                System.out.println("Hash table full !!");
            
		}
        arr[slot] = new Entry(key, 1);
	}

	public int getCount(String key) {
		int slot = h(key);
		int index = slot;
		while(arr[slot] != null) {
			if(arr[slot].key.equals(key)) {
				return arr[slot].count;
			}
			slot = (slot + 1) % size;
            if(slot == index)
                break;
		}
		return 0;
	}

    public void printWordCounts()
	{
		System.out.println("Word");
       
		for(Entry e :arr)
		{
			if (e!=null) {
				System.out.println("Word Count : " + e.getCount());
			}	
		}
		
    }
	public boolean isEmpty() {
		return arr[0] == null;
	}
}
