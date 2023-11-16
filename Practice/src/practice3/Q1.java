package practice3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 지불할 금액을 정수로 입력 받아 화폐단위가 각각 몇 개씩 필요한지 출력하는 프로그램을 작성하시
		// 오. 입력은 최소 10만원 단위로 입력, 화폐단위는 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 10
		// 가지이며, 가능한 큰 화폐단위로 지불, 입력이 236,873이면 50000원권 4매, 10000원권 3매, 5000원권 1
		// 매, 1000원권 1매, 500원 1매, 100원권 3매, 50원권 1매, 10원권 2매, 5원권 0매, 1원권 3개로 출력하라. 단 화폐단위는 배열에 저장한다.
				int [] arr1 = {50000,10000,5000,1000,500,100,50,10,5,1};
				Scanner sc =new Scanner(System.in);
				System.out.print("금액을 입력해주세요>>");
				int money=sc.nextInt();
				for(int i1 = 0; i1<arr1.length; i1++) {
					System.out.print(arr1[i1]+"원권"+money/arr1[i1]+"매, ");
					money %= arr1[i1];
				}
	}

}
