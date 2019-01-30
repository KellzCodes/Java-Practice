package chapter6;

public class TriangleNumbers {

//	public int triangleNumber(int n) {
//		int result = 0;
//		for (int i = n; i > 0 ; i--) {
//			result += i;
//		}
//		return result;
//	}
	
	public int triangleNumber(int n) {
		if (n == 0) return 0;
		return n + triangleNumber(n-1);
	}
 	
	
	
	public static void main(String[] args) {
		System.out.println(new TriangleNumbers().triangleNumber(5));
	}
}
