package classtest;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kim, lee, ahn, song 이 인스턴스
		Person kim = new Person();
		kim.name = "김유신";
		Person lee = new Person();
		kim.name = "이순신";
		Person ahn = new Person();
		kim.name = "안연수";
		Person song = new Person();
		kim.name = "송치원";
		lee.showPersonInfo();
		ahn.showPersonInfo();
		song.showPersonInfo();
		
		Person lim =new Person("임꺽정", 180, 80, 'M',true);
		lim.showPersonInfo();
	}

}
