package backjjEx;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0~99������ ���ڸ� �Է��ϼ���>");
		int num = Integer.parseInt(scanner.nextLine());
		if (num < 0 || num > 99) {
			System.out.println("���ڰ� �ʹ� �۰ų� Ů�ϴ�. �ٽ��Է��ϼ���");
			num = Integer.parseInt(scanner.nextLine());
		}

		int value10 = 0;
		int value1 = 0;
		int i = 0;
		int tmp = num;
		boolean a = true;
		
		// ���� ���� ���� �ڸ����� ������ ���� �ڸ����� ���� �̷��������.
		value10 = num / 10;
		while (a) {
			if (num >= 10) {
				value1 = num % 10;
			} else
				value1 = num;
			num = value10 + value1;
			if (tmp==(((value1*10)+num))) {
				a = false;
			}
			value10 = value1;
			i++;
		}
		System.out.println("�Է¼����� ����Ŭ ���� : " + i);
	}

}
