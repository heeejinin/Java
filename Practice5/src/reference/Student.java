package reference;
class Subject{//멤버변수에 하기 내용이 포함되어 있음, 퍼블릭 클래스에서 줄줄이 나열할 필요 x
	int subjectNum;
	String subjectTitle;
	String teacherName;
	int score;
}

public class Student {
	int studentID;
	String studentName; 
	Subject korea;
	Subject math;
	Subject en;
	Subject java;
	
	
	/*ring koreaTitle;
	int koreaScore;
	String kereaTeacher;
	String mathTitle;
	int marhScore;
	String mathTeacher;*/
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName =studentName;
		korea = new Subject();
		math = new Subject();
		en = new Subject();
		java = new Subject();
	}
	
	public static void main(String [] args){//스튜던트 클래스랑 전혀 상관없이 실핼시키기 위한 실행문
		Student kim = new Student(1001, "이순신");
		kim.korea.subjectTitle = "국어";
		kim.math.score = 100;
		System.out.println(kim.korea.subjectTitle);
	}
}