package singleton;

public class Car {
	public int carNum;
	public String carName;
	
	public Car(int serialNum) {//생성자를 만드는 이유는 시리얼 넘버를 카에 저장하기 위해 만듦
		this.carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
}
