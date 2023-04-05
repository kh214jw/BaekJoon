package Step02;

import java.util.Scanner;

//#2480
public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if( a == b && b == c && a == c ){
            int m = 10000 + a * 1000;
            System.out.println(m);
        }else if( a == b || b == c || a == c ){
            if( a == b ){
                int m = 1000 + a * 100;
                System.out.println(m);
            }else if( b == c){
                int m = 1000 + b * 100;
                System.out.println(m);
            }else{
                int m = 1000 + a * 100;
                System.out.println(m);
            }
        }else{
            if(a>b && a>c){
                int m = a * 100;
                System.out.println(m);
            }else if(b>a && b>c){
                int m = b * 100;
                System.out.println(m);
            }else{
                int m = c * 100;
                System.out.println(m);
            }
        }
	}

}
