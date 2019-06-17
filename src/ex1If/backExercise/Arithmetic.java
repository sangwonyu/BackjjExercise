package ex1If.backExercise;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 숫자를1000이하로 입력하시오>");
		int num =Integer.parseInt(scanner.nextLine());
		//변수선언
		int firdigit=0;
		int secondigit=0;
		int thirdigit=0;
		int z=0;
		//100미만 수
		if(num<100&&num>0) {
			System.out.println("한수의 개수: "+num);
		}
		//100이상 수
		for(int i=100; i<=num;i++) {
			firdigit=i%10;
			thirdigit=i/100;
			secondigit=(i-thirdigit*100)/10;
			
			if((thirdigit-secondigit)==(secondigit-firdigit)) {
				z++;
			}
		}
		if(num>=100&&num<=1000) {
			int total=z+99;
		System.out.println("한수의 개수: "+ total);
		}
	}
}
