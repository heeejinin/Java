package switchtest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5층의 건물의 층수를 받아 어떤 층인지 알려주는 프로그램
		//1층: 약국, 2층: 정형외과, 3층: 피부과, 4층: 치과, 5층: 헬스장
		
		Scanner sc = new Scanner(System.in);
		System.out.print("층수 입력>>");
		int floor = sc.nextInt();
		//String store = ""; 도 가능 (SwitchTest2참고)
		switch(floor) {
			case 1:
				System.out.println(floor + "은 약국 입니다.");
				break;
			case 2:	
				System.out.println(floor + "은 정형외과 입니다.");
				break;
			case 3:
				System.out.println(floor + "은 피부과 입니다.");
				break;
			case 4:
				System.out.println(floor + "은 치과 입니다.");
				break;
			case 5:
				System.out.println(floor + "은 헬스 클럽 입니다.");
				break;
			default:
				System.out.println(floor + "은 없는 층 입니다.");
		}
	}

}
