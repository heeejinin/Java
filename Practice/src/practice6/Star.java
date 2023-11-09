package practice6;

public class Star {
	public int starNum;
	public int guestCount;
	public int money;

	public Star(int starNum) {
		this.starNum = starNum;
	}
	
	public void buy(int money) {
		this.money += money;
		guestCount++;
	}

	public void showInfo() {
		System.out.println("별다방" + starNum + "번의 수입은" + money + "입니다.");
	}
}
