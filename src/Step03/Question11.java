package Step03;

import java.util.Scanner;

//#10952
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      while(true){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        if(a == 0 && b == 0){
	            sc.close();
	            break;
	        }
	        
	        System.out.println( a + b );
	      }

	}

}
