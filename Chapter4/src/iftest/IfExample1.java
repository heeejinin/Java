package iftest;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tab 키로 들여쓰기, {}중괄호 안에는 반드시 한칸 들여쓰기를 할 것
		// shift + tab : 반대로 들여쓰기
		// ctrl + shift + F : 자동 줄 맞춤 기능
		
		//if(조건식 : trure, false 가 출력되는 내용) {
		//		실행문;
		//	}else if(*if문이 있어야 작성 가능*조건식 : trure, false 가 출력되는 내용) {
		//		실행문;
		//	}else(*if문이 있어야 작성 가능*조건식 : trure, false 가 출력되는 내용) {
		//		실행문;
		int i =11;
		int j = 15;
		if(i > 10) {
			String str = "i는 10보다 크다.";
			System.out.println(str);	
		}
		
		if(j > 10) {//if문 안에 if문 작성 가능
			String str = "j는 10보다 크다.";
			System.out.println(str);
		}	
			
		
		if(i < j) {
			String str = "i는 j보다 작습니다.";
			System.out.println(str);
		}
		
		else if(i > j) {
			String str = "i는 j보다 큽니다.1";
			System.out.println(str);
		}
		
		//else if(i > j) {
		//	String str = "i는 j보다 큽니다.2"; / else if 같은게 두 개이면 첫번째 조건만 도출
		//	System.out.println(str);
		//}
		
		else {
			String str = "i는 j와 같습니다."; // else는 if문이나 else if문 모두 f이면 실행됨/ else는 조건(sth)을 따로 설정하지 않음
			System.out.println(str);
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		//새로운 if문을 만들고 싶다면 작성 중이었던 if문 밖에서 새로 작성하면 상위 if문과는 관계없는 새로운 if문 생성됨
	}

}