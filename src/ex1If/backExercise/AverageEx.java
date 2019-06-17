package ex1If.backExercise;
import java.util.*;

public class AverageEx {

	public static void main(String[] args) {
		System.out.print("학생 수를 입력하시오.>>");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("학생 수는"+input+"명");
		
		System.out.println("각각의 학생 성적을 입력하시오.(단, ','을 이용해 구분해서 작성)>>");
		Scanner scan2= new Scanner(System.in);
		String input2 =scan2.nextLine();
		String[] seper = input2.split(",");
		System.out.print("각각의 학생 성적은");
		
		for(int i=0;i<seper.length;i++) {
			
			System.out.print(seper[i]+"  ");
		}System.out.print('\n');
		int sum=0;
		int average =0;
		double sum2 =0;
		for(int i=0;i<seper.length;i++) {
			sum += Integer.parseInt(seper[i]);
		} average = sum/seper.length;
		System.out.println("합은" + sum+"점");
		System.out.println("평균은" + average+"점");
		
		for(int i=0;i<seper.length;i++) {
			if(average < Integer.parseInt(seper[i])) {
				sum2 += 1;
			}
		} 
		System.out.println("평균이상 학생 수는"+sum2);
		
		double rate=(Math.round((sum2/seper.length)*1000)/1000.0)*100;
		System.out.println("평균이상 학생 비율"+rate+"%");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
