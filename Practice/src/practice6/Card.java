package practice6;

public class Card {
	public static int serialNum = 10000;
	public int customerCount;
	public int cardNum;
	
	public Card() {
		serialNum++;
		customerCount = serialNum;
		cardNum = customerCount + 100;
	}
	public static int getSerialNum() {
		return serialNum;
	}
}
