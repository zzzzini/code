import java.util.regex.Pattern;

public class RegularEx4 {

	public static void main(String[] args) {
		String name = "홍길동";
		String tel = "010-1234-5678";
		String email = "test@naver.com";
		
		String p1 = "^[가-힣]*$";
		String p2 = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
		String p3 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		boolean result1 = Pattern.matches(p1, name);
		boolean result2 = Pattern.matches(p2, tel);
		boolean result3 = Pattern.matches(p3, email);
		System.out.println("이름 : " + result1);
		System.out.println("전화번호 : " + result2);
		System.out.println("이메일 : " + result3);
	}

}
