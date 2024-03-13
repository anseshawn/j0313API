package api1_Object;

import java.util.Objects;

public class T3_isNull {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		System.out.println("vo : "+ vo);
		
		if(vo == null) System.out.println("1. vo는 null 입니다.");
		else System.out.println("1. vo는 null이 아닙니다.");
		System.out.println();
		//vo 자체에는 내용이 있기 때문에 vo로 null을 비교하면 데이터가 들어갔는지 아닌지 확인이 어려움
		
		if(vo.getName() == null) System.out.println("2. vo.name는 null 입니다.");
		else System.out.println("2. vo.name는 null이 아닙니다.");
		System.out.println();
		
		if(Objects.isNull(vo)) System.out.println("3. vo는 null 입니다.");
		else System.out.println("3. vo는 null이 아닙니다.");
		System.out.println();

		if(Objects.nonNull(vo)) System.out.println("4. vo는 null이 아닙니다.");
		else System.out.println("4. vo는 null입니다.");
		System.out.println();

		
		//vo.setName("홍길동");
		if(Objects.nonNull(vo.getName())) {
			System.out.println("5. name은 "+vo.getName()+" 입니다.");
			if(vo.getName().equals("홍길동")) System.out.println("관리자");
			else System.out.println("방문객");
		}
		else System.out.println("5. vo.name는 null입니다.");
		System.out.println();
		
		vo.setName("홍길동");
		if(vo.getName().equals("홍길동")) { // name이 null값일 땐 에러 발생. null값은 비교할 수 없음
			System.out.println("6. name은 "+ Objects.requireNonNull(vo.getName())+" 입니다."); //require: 필수입력, null이 아닐 경우 필수적으로 이 값을 출력한다.
//			if(vo.getName().equals("홍길동")) System.out.println("관리자");
//			else System.out.println("방문객");
		}
		else System.out.println("6. vo.name는 null입니다.");
		System.out.println();
		
		vo.setName(null);
//		System.out.println("7. name은 "+ vo.getName()+" 입니다.");
		System.out.println("8. name은 "+ Objects.requireNonNull(vo.getName())+" 입니다.");
	}
}
