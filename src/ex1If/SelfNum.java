package ex1If;

public class SelfNum {

	public static void main(String[] args) {
		int[] arr = new int[10001];
		for (int i = 0; i <= 10000; i++) {
			arr[i] = 1;
		}
		for (int i = 0; i <= 10000; i++) {
			if (d(i) <= 10000) {
				arr[d(i)] = d(i);
			}
		}
		for (int i = 0; i <= 10000; i++) {
			if (arr[i] == 1) {
				System.out.print(i + ",");
			}
		}
	}

	public static int d(int n) {
		int num = n + n / 10 + n % 10;
		return num;
	}
}
