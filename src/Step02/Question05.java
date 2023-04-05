package Step02;

import java.util.Scanner;

//#2584
public class Question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if( m < 45 ){
            if( h == 0 ){
                h = 23;
                m = m - 45 + 60;
                System.out.println( h + " " + m);
            }else{
                h = h - 1;
                m = m - 45 + 60;
                System.out.println( h + " " + m);
            }
        }else{
            m = m - 45;
            System.out.println( h + " " + m);
        }

	}

}
