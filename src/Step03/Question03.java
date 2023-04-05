package Step03;

import java.util.Scanner;

//#8393
public class Question03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int num = 1;
        
        for( int i = 2; i <= n; i++ ){
            num = num + i;
        }
        
        System.out.println(num);

	}

}
