package practice;

import java.util.ArrayList;

public class DogTestArrayList {
	ArrayList<Dog> dogList = new ArrayList<Dog>();

	public void addDog(String name, String type) {
		dogList.add(new Dog(name, type));
	}

	public void showDogList() {
		for (Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogTestArrayList dogList = new DogTestArrayList();
		dogList.addDog("사모예드1", "사모예드");
		dogList.addDog("사모예드2", "사모예드");
		dogList.addDog("사모예드2", "사모예드");
		dogList.addDog("사모예드3", "사모예드");
		dogList.addDog("사모예드4", "사모예드");
		dogList.addDog("사모예드5", "사모예드");
		dogList.showDogList();
	}

}