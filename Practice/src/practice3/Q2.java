package practice3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. 임의의 수자를 입력하여 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는
		// 경우 ‘박수짝’을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			boolean a = setFlag(i / 10); // 십의 자리 숫자 구하기
			boolean b = setFlag(i % 10); // 일의 자리 숫자 구하기
			if (a && b) {
				System.out.println("짝짝");
			} else if (a || b) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
//		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =1; i<=num; i++) {
			i/=10;
		}

	}

	public static boolean setFlag(int num) {
		boolean flag = false;
		if (num == 3 || num == 6 || num == 9) {
			flag = true;
		}
		return flag;
	}

}
