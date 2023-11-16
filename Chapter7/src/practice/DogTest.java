package practice;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dog =new Dog[5];
		
		dog[0]=new Dog("1","사모예드");
		dog[1]=new Dog("2","사모예드");
		dog[2]=new Dog("3","사모예드");
		dog[3]=new Dog("4","사모예드");
		dog[4]=new Dog("5","사모예드");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo()); 
		}
		System.out.println("===============향상된 for문(=foreach문)===============");
		for(Dog dog1 : dog) {
			System.out.println(dog1.showDogInfo());
		}
	}

}
