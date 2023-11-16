package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(1001, "lee");
		lee.addSubject("국어",100);
		lee.addSubject("수학",50);
		lee.showInfo();
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		kim.showInfo();
		System.out.println();
		
		System.out.println("======================================================");

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번과 이름을 작성해주세요.");
		Student student = new Student(sc.nextInt(),sc.next());
		//과목 수를 입력하여 설정하기 (반복문)
		System.out.println("과목 수를 입력해주세요.");
		int count = sc.nextInt();
		for(int i =0; i<count; i++) {
			System.out.println("과목이름과 점수를 입력해주세요.");
			student.addSubject(sc.next(),sc.nextInt());
			
		}
		System.out.println("======================================================");
		//내가 원하는 이름을 지정하여 showInfo() 실행하기 (ArrayList 사용)
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(lee);
		studentList.add(kim);
		studentList.add(student);
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		String name =sc.next();
		for(Student s : studentList) {
			if(s.studentName.equals(name)) {
				s.showInfo();
				break;
			}
		}


		
	
		
		
	}

}
