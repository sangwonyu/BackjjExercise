package ex1If;
import java.util.Scanner;
public class PlusCycleEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를입력하세요>");
		int num = Integer.parseInt(scanner.nextLine());
		int num2=num;
		int i=0;
		int sum =0;
		while(num2!=num) {
			
			int a =num/10;
			int b =num%10;
			int c =a+b;
			num =b+c%10;
			i++;
			sum+=i;
		} System.out.println("cycle.length:"+sum);
		// TODO Auto-generated method stub

	}

}
