package Step04;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; 				//v ���� ���� ����
		int n = sc.nextInt(); 	
		int[] num = new int [n];	//���ڸ� ���� ������ �迭 ����, ���̴� n��ŭ
		
		for(int i = 0; i < n; i++) {	//n������ 
			num[i] = sc.nextInt();		//�迭�� �Է��� ���� �Է¹ޱ� 
		}
		
		int v = sc.nextInt();
		
		for(int j = 0; j < num.length; j++) {	//�迭�� ���̱���
			if(v == num[j]) {	//��ġ�ϴ� ���ڸ� �߰��� �� ���� count�� 1�� �ø�
				count++;
			}
		}
		System.out.println(count);
	}

}
