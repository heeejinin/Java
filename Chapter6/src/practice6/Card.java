package practice6;

public class Card {
	public static int serialNum = 100000;
	public int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	public Card(int companyserialNum) {
		cardNum =companyserialNum;
	}
	public void showInfo(int companyserialNum) {
		System.out.println(cardNum);
	}
}
