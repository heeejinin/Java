package switchtest;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switch(변수) {
//			case 변수와 비교하고 싶은 값 :
//				실행문;
//				break;//끊어주는 것. 없으면 젤 아래 케이스를 실행시킴
//			case 변수와 비교하고 싶은 값 :
//				실행문;
//				break;
//			default : //는 넣어도 되고 안넣어도 됨
//				실행문;
//				break;
//		}
		int ranking = 1;
		char medalColor;
		switch(ranking) {
		case 1 :
			medalColor = 'G';
			break;
		case 2 :
			medalColor = 'S';
			break;
		case 3 :
			medalColor = 'B';
			break;
		default :
			medalColor = 'A';
		break;
		}
		System.out.println(ranking + "등의 메달 색은 " + medalColor + " 입니다.");
	}

}
