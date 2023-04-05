package Step01;

import java.util.*;

//#10430
public class Question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println( (a + b ) % c );
        System.out.println( (((a % c) + (b % c)) % c) );
        System.out.println( (a * b) % c);
        System.out.println( ((a % c ) * (b % c)) % c);

	}

}
