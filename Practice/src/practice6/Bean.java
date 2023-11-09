package practice6;

public class Bean {
	public int beanNum;
	public int guestCount;
	public int money;

	public Bean(int beanNum) {
		this.beanNum = beanNum;
	}

	public void buy(int money) {
		this.money += money;
		guestCount++;
	}

	public void showInfo() {
		System.out.println("콩다방" + beanNum + "호 점의 수입은" + money + "입니다.");
	}
}
