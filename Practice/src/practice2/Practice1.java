package practice2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1-1.
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println(a + "+" + b + "은 " + sum);

		
//Q1-2.
		System.out.print("몇 층인지 입력하세요>>");
		int x2 = sc.nextInt();
		int mult = x2 * 5;
		System.out.println(mult + "m 입니다.");
		
		
//Q1-3.
		System.out.print("x 값을 입력하세요>>");
		int x = sc.nextInt();
		int y = (x * x) - (3 * x) + 7;
		System.out.println("x=" + x + ", y= " + y);

		
//Q1-5.
		System.out.print("논리 연산을 입력하세요>>");
		boolean c = sc.nextBoolean();
		String op =sc.next();
		boolean d =sc.nextBoolean();
		switch(op) {
		case "AND" :
			System.out.println(c && d);
			break;
		case"OR" :
			System.out.println(c|| d);
			break;
		}
		
		
//Q1-6.
		System.out.print("돈의 액수를 입력하세요>>");
		int money = sc.nextInt(); //65245
		int m1 =money/50000;
		money =money%50000; //15245
		int m2 =money/10000;
		money = money%10000; //5245
		int m3 =money/1000;
		money = money%1000; //245
		int m4 =money/500;
		money = money%500; //245
		int m5 =money/100;
		money = money%100; //45
		int m6 =money/10;
		money = money%10; //5
		int m7 =money/1;
		money = money%1; //0
		System.out.println("50,000원"+m1+"개, 10,000원"+m2+"개, 1,000원"+m3+"개, 500원"+m4+"개, 100원"+m5+"개, 10원"+m6+"개, 1원"+m7+"개");
		
	
//Q1-7.
		System.out.print("학점을 입력하세요>>");
		String Score = sc.next(); //String Score = sc.nextLine();도 문자열 입력
		switch (Score) {
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "c": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;

		}

//Q1-8.
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int count = sc.nextInt();
		int cost = 0;
		if(coffee.equals("에스프레소")) {
			cost=2000;
		}else if(coffee.equals("아메리카노")) {
			cost=2500;
		}else if(coffee.equals("카푸치노")) {
			cost=3000;
		}else if(coffee.equals("카페라떼")){
			cost=3500;
		}System.out.println(cost*count + "원 입니다.");
	}
//다른 풀이
//System.out.print("커피 주문하세요>>");
//	//String coffee = sc.next();
//	int count = sc.nextInt();
//	int total = 0;
//	if(coffee.equals("에스프레소")) {
//		total=2000*count;
//	}else if(coffee.equals("아메리카노")) {
//		total=2500*count;
//	}else if(coffee.equals("카푸치노")) {
//		total=3000*count;
//	}else if(coffee.equals("카페라떼")){
//		total=3500*count;
//	}System.out.println(total + "원 입니다.");
//}

	//스위치문 해답 참고
	//switch
//	System.out.print("커피 주문하세요>>");
//	String coffee = sc.next();
//	int count = sc.nextInt();
//	int total = 0;
//			switch(coffee) {
//			case "에스프레소" : 
//				total = 2000*count;
//				break;
//			case "아메리카노" : 
//				total = 2500*count;
//				break;
//			case "카푸치노" : 
//				total = 3000*count;
//				break;
//			case "카페라떼" : 
//				total = 3500*count;
//				break;
//			}
//			System.out.println(total + "원 입니다." );
}