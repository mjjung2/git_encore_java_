
public class CastingMain {

	public static void main(String[] args) {
		
			byte x , y , sum ; // 변수 선언
			x = 10 ; 
			y = 10 ;
			sum = (byte)(x + y) ;
			System.out.println("sum = "+sum );

			char charValue = 'A' ;
			char charValue02 = 'B' ;
			System.out.println("char value = "+charValue);
			System.out.println(charValue + charValue02 );
			System.out.println((char) (charValue + charValue02) );
			System.out.println((char)(97));
	}

}
