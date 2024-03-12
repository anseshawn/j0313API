package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	
	@Override //Object가 가장 높은 클래스라 이미 상속받고있기 때문에 오버라이드 됨
	public boolean equals(Object obj) { 
		if(this.name == ((Bb)obj).name) return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode(); //name의 hashCode값 리턴
	}
}

public class T1_hashCode2 {
	public static void main(String[] args) {
		// HashMap
		HashMap<Integer, String> map = new HashMap<>(); //key는 객체 이름(int라면 Integer로)으로 적어야함
		
		map.put(1, "데이터1"); //키가 같다면 데이터를 덮어쓰게 됨 (데이터는 같아도 상관없음)
		map.put(1, "데이터2"); //hashcode로 같은 걸 보고 찾아간다 
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2 = new HashMap<Aa, String>();
		map2.put(new Aa("첫번째"), "데이터1");
		map2.put(new Aa("첫번째"), "데이터2"); //key 값은 같지만 new로 새로 생성했기 때문에 다른key로 인식
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap<>(); //hashCode와 equals로 비교한 데이터가 같으면 같은 데이터로 인식한다
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2"); // '첫번째'의 hashCode가 같기 때문에 equals연산에 따라 데이터 덮어 씌움
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
	}
}
