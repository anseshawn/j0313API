package api9_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		// DecimalFormat() : 데이터 출력 포맷을 지정한다
		// 서식기호1 - 0: 숫자를 표시(해당자리에 숫자가 없으면 0으로 표시)
		// 서식기호2 - #: 숫자를 표시(의미가 없는 0(무효의 0)을 화면에 출력시켜주지 않는다 
		
		double su = 12345.0;
		System.out.println("원본 : "+su);
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("1: "+df.format(su)); //12,345.679
		
		df = new DecimalFormat("0"); // 정수부분만
		System.out.println("2: "+df.format(su));
		
		df = new DecimalFormat("0,000"); //천 단위마다 콤마 : 큰데이터는 이상없으나 작은 데이터엔 문제가 생김
		System.out.println("3: "+df.format(su)); //12.6789인 경우 0,013으로 출력
		
		df = new DecimalFormat("#,###");
		System.out.println("4: "+df.format(su));
		
		df = new DecimalFormat("#");
		System.out.println("5: "+df.format(su));
		
		df = new DecimalFormat("#,##0"); //마지막의 0은 의미가 있는 걸로 보고 그 앞은 의미없으면 무시
		System.out.println("6: "+df.format(su));
		
		df = new DecimalFormat("#,##0.#");
		System.out.println("7: "+df.format(su));
		
		df = new DecimalFormat("#,##0.0"); // 0은 숫자가 없으면 자기 자리에 0을 채움
		System.out.println("8: "+df.format(su));

		df = new DecimalFormat("@@@@@@@@@@.0");
		System.out.println("9: "+df.format(su));
		
		double su2 = 0.9576;
		df = new DecimalFormat("0.0%"); // 퍼센트 출력
		System.out.println("10: "+df.format(su2));
		
		df = new DecimalFormat("W#,##0"); //원화단위 출력, 진짜 기호를 출력하고 싶을시 유니코드 찾아서 입력
		System.out.println("11: "+df.format(su));
		
		df = new DecimalFormat("\u00A4#,##0");
		System.out.println("12: "+df.format(su));
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); //달러단위로 바꾸기
		nf.setMinimumFractionDigits(2); //.00 << 최소단위 지정
		System.out.println("13: "+nf.format(su));
	}
}
