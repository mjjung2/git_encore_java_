
public class StringDemoMain {

	public static void main(String[] args) {
		//자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은? string!
//		String str01 = "임섭순" ;
//		String str02 = "임섭순";
	String str01 = new String("임섭순") ; //인스턴스가 할당 됨
	String str02 = new String("임섭순") ;
		
		
		if (str01 == str02) {
			System.out.println("주소값이 동일합니다."); // 인스턴스가 할당된 주소가 달라
		} else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		if ( str01.equals(str02)) {
			System.out.println("값이 동일합니다."); // 객체 내부의 그 글자는 같아
		} else {
			System.out.println("값이 동일하지 않습니다.");
		}
	}
}
