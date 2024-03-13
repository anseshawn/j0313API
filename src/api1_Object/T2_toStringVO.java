package api1_Object;

public class T2_toStringVO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}
	
	
	
//	@Override
//	public String toString() { // 1. 원래는 객체의 주소가 출력되기 때문에 오버라이드 해서 출력 결과를 조절하여 사용
//		// 2. vo객체에서 값이 제대로 넘어왔는지 찍어봐야 함: 미리 오버라이딩 해놓고 toString 이용
//		return "VO = [name="+name+", age="+age+", gender="+gender+", job="+job+", address="+address+"]";
//	}
	
	
}
