package abstracttest;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스는 인스턴스를 만들 수 없다. 상속하기 위해 존재하기 때문
		Computer myComputer =new Desktop();//추상 클래스 불러오기 => 결과: 에러
		myComputer.turnOn();
		myComputer.display();
		myComputer.typing();
		myComputer.turnOff();
		System.out.println("--------------------------------------------------------");
		Computer noteBook = new LGGram();
		noteBook.turnOn();
		noteBook.display();
		noteBook.typing();
		noteBook.turnOff();
	}

}
