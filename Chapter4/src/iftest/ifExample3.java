package iftest;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적에 따라 학점 부여하기
		// 100~90점 : A
		// 89~80점 : B
		// 79~70점 : C
		// 69~60점 : D
		// 그 외 : F
		System.out.print("점수를 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // 점수를 입력받을 변수
		String grade = ""; // A~F 학점을 저장하는 변수
		
		if(90 <= score) {
			grade = "A";
		}
		else if(80 <= score) {
				grade = "B";
		}
		else if(70 <= score) {
				grade = "C";
		}
		else if(60 <= score) {
				grade = "D";
		}
		else{
				grade = "F";
		}

		System.out.println("학점은 " + grade + "입니다.");
		if(grade.equals("F")) {
			System.out.println("열공이 필요합니다.");
		}
		//String끼리 비교할 경우 "=="으로 같다고 하기 보다는 .equals로 비교하는게 정확하다
		String f =new String("F");
		System.out.println(grade == f); //false 가 나오는 경우가 있기 때문에 
		System.out.println(grade.equals("F")); // String을 비교할 때, 반드시 equals()를 써서 비교할 것
	}

}
