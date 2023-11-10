package practice;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. 아침 출근길에 김씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 이씨는 콩
//		다방에서 4500원을 내고 라테를 사 마셨습니다. 학생, 버스, 지하철 실습과 같이 객체간 협력
//		을 이용하여 위의 내용의 코드를 작성하세요.
		
		//객체 김씨
		StarCafe sCafe = new StarCafe("서면점");
		BeanCafe bCafe = new BeanCafe("서면점");
		Customer kim = new Customer("김씨",10000);
		Customer lee = new Customer("이씨",10000);
		kim.takeStarCafe(sCafe, 4000);
		kim.showInfo();
		sCafe.showInfo();
		
		lee.takeBeanCafe(bCafe, 4500);
		lee.showInfo();
		bCafe.showInfo();
		
	}

}