package singleton;

public class CompanyTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company myCompany1 =Company.getinstance();
		Company myCompany2 =Company.getinstance();
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		System.out.println(myCompany1 == myCompany2);
		//Company myCompany3 =new Company(); => new는 사용 불가능 함 오류 뜸 /get을 써야 함.
	}
}
