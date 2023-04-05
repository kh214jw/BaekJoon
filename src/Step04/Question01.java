package Step04;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; 				//v 숫자 갯수 선언
		int n = sc.nextInt(); 	
		int[] num = new int [n];	//숫자를 담을 일차열 배열 선언, 길이는 n만큼
		
		for(int i = 0; i < n; i++) {	//n번까지 
			num[i] = sc.nextInt();		//배열에 입력할 숫자 입력받기 
		}
		
		int v = sc.nextInt();
		
		for(int j = 0; j < num.length; j++) {	//배열의 길이까지
			if(v == num[j]) {	//일치하는 숫자를 발견할 때 마자 count를 1씩 올림
				count++;
			}
		}
		System.out.println(count);
	}

}
