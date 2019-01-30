package chapter3;

public class BubbleSorter {

	private int[] data;

	public BubbleSorter(int[] data) {
		if (data == null)
			throw new RuntimeException("Data cannot be null");
		this.data = data;
	}

	public void sort() {
		for (int i = 0; i < data.length - 2; i++) {
			for (int j = data.length - 1; j > i ; j--) {
				if (data[j] < data[j - 1]) {
					int tmp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = tmp;
				}
			}
		}
	}

	public int[] getData() {
		return this.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (int i : data) {
			sb.append(i);
			sb.append(',');
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append('}');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int[] data = {6,4,7,9,3,0,10};
		BubbleSorter sorter = new BubbleSorter(data);
		sorter.sort();
		System.out.println(sorter);
	}
}
