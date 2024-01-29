import com.encore.test.StudentVO;

public class ReferenceMain {
	public static void main(String[] args) {
		StudentVO stuObj = new StudentVO() ;
		// 위, 참조타입 변수 = 객체 생성
		// 하기 3줄, 접근제어자가 public으로 열려있을 때만 실행이 가능해
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name );
//		stuObj.name = "포케";
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name );

		System.out.println("인스턴스 소유의 메서드 호출 : " );
		stuObj.setName("섭섭해"); // 메서드 호출
		
		String returnValue = stuObj.getName() ;
		System.out.println(returnValue);
		System.out.println(stuObj.getName());
	}
}
