package Step03;

import java.util.Scanner;

//#25304
public class Question04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int money = sc.nextInt();
        int n = sc.nextInt();
        int m = 0;
        
        for( int i = 0; i < n; i++){
            int product = sc.nextInt();
            int product_num = sc.nextInt();
            
            int a = product * product_num;
            m = m + a; 
        }
        
        if( m == money ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}

}
