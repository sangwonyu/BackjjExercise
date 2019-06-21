package programmerExcercise;

import java.util.Scanner;

public class World124 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("아무숫자를 입력하세요>");
		String str =scn.nextLine();
		int input =Integer.parseInt(str);
		boolean run =true;
		String result="";
		
		while(run) {
			if(input%3==0) {
				result ="4"+result;
				input=(input/3)-1;
			} else if(input%3==1) {
				result="1"+result;
				input=input/3;
			} else if(input%3==2) {
				result="2"+result;
				input=input/3;
			}
			
			if(input<3) {
				if(input==1) {
					result="1"+result;
				} else if(input==2) {
					result="2"+result;
				}
				run=false;
			}
		}
		System.out.println("결과값 : " + result);
	}
}
