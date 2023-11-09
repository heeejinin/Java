package practice6;

public class Guest {//멤버변수
	public String guestName;
	public int money;

	public Guest(String guestName, int money) {// 매개변수
		this.guestName = guestName; //생성
		this.money = money;

	}

	public void buyBean(Bean bean) {
		bean.buy(4500);
		this.money -= 4500;
	}

	public void buyStar(Star star) {
		star.buy(4000);
		this.money -= 4000;
	}

	public void showInfo() {
		System.out.println(guestName + "님의 돈은" + money + "입니다.");
	}
}
