package ex1If.backExercise;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>");
		int stNum = Integer.parseInt(scanner.nextLine());

		boolean a = true;
		while (a) {
			if ((stNum / 3) % 2 != 0) {
				System.out.println("다시입력하세요>");
				stNum = Integer.parseInt(scanner.nextLine());
			} else
				a = false;
		}

		for (int i = 1; i <= 6; i++) {
			if (i == 1+(i-1)) {
				for (int z = 1; z <= (3 * 2) - 1; z++) {
					if (z % 3 == 0) {
						System.out.print("*");
					}
					System.out.print(" ");
				}System.out.println();
			}
			if (i == 2) {
				for (int z = 1; z <= (3 * 2) - 1; z++) {
					if (z % 2 == 0) {
						System.out.print("*");
					} else System.out.print(" ");
				}System.out.println();
			}
			if (i == 3) {
				for (int z = 1; z <= (3 * 2) - 1; z++) {
						System.out.print("*");
				}
			}
		}
	}
}
