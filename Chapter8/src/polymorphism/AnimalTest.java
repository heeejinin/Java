package polymorphism;

class Animal {// 메인 메서드 (상위 클래스)
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {// 하위 클래스
	@Override
	public void move() {// move는 오버라이드된 메서드
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리는 하늘을 날 수 있습니다.");

	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 잘 합니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Animal());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Tiger());
		System.out.println("---------------다운 캐스팅---------------");
		// 다운 캐스팅: 상위 클래스 형 변환 되어있던 클래스를 본래의 하위클래스로 형 변환 하는 것
		// 다운캐스팅이 가능하려면 형 변환 되기 전의 자료형이 같아야 합니다.
		Animal human = new Tiger();
		if (human instanceof Human) {
			Human cHuman = (Human) human;
			cHuman.readBook();
		} else if (human instanceof Eagle) {
			Eagle cEagle = (Eagle) human;
			cEagle.flying();
		} else if (human instanceof Tiger) {
			Tiger cTiger = (Tiger) human;
			cTiger.hunting();
		} else {
			human.move();
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();// 가상 메서드를 이용해 같은 이름(move)으로 4개 실행 중

	}
}
