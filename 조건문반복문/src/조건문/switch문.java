package 조건문;

import java.util.Scanner;

public class switch문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요. ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		default:
			System.out.println("현재 계절은 겨울입니다.");		
		}		
	}
}
