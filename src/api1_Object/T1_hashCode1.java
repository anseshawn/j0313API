package api1_Object;

public class T1_hashCode1 {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "김말숙";
		String s4 = new String("홍길동");
		String s5 = new String("홍길동");
		
		if(s1 == s2) System.out.println("s1과 s2는 같습니다.");
		else System.out.println("s1과 s2는 다릅니다.");
		System.out.println();
		
		if(s1 == s3) System.out.println("s1과 s3는 같습니다.");
		else System.out.println("s1과 s3는 다릅니다.");
		System.out.println();
		
		if(s1 == s4) System.out.println("s1과 s4는 같습니다.");
		else System.out.println("s1과 s5는 다릅니다.");
		System.out.println();
		
		if(s4 == s5) System.out.println("s1과 s5는 같습니다.");
		else System.out.println("s1과 s5는 다릅니다.");
		System.out.println();

		if(s1.equals(s4)) System.out.println("s1과 s4는 같습니다.");
		else System.out.println("s1과 s5는 다릅니다.");
		System.out.println();
		
		if(s4.equals(s5)) System.out.println("s1과 s5는 같습니다.");
		else System.out.println("s1과 s5는 다릅니다.");
		System.out.println("=================================================");
		
		System.out.println("11(hashCode)=> s1 : " + s1.hashCode() + ", s2 : "+s2.hashCode());
		System.out.println("12(hashCode)=> s1 : " + s1.hashCode() + ", s3 : "+s3.hashCode());
		System.out.println("13(hashCode)=> s1 : " + s1.hashCode() + ", s4 : "+s4.hashCode());
		System.out.println("14(hashCode)=> s4 : " + s4.hashCode() + ", s5 : "+s5.hashCode());
	}
}
