package practice6;

public class Practice6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. 아침 출근길에 김씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 이씨는 콩
//		다방에서 4500원을 내고 라테를 사 마셨습니다. 학생, 버스, 지하철 실습과 같이 객체간 협력
//		을 이용하여 위의 내용의 코드를 작성하세요.
		
		//객체 김씨
		Guest kim = new Guest("kim",7000);
		Guest lee = new Guest("lee",10000);
		
		Bean bean1 = new Bean(1);
		lee.buyBean(bean1);
		lee.showInfo();
		bean1.showInfo();

		Star star2 = new Star(2);
		kim.buyStar(star2);
		kim.showInfo();
		star2.showInfo();
		
	}

}
