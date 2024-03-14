package api8_Date;

import java.util.TimeZone;

public class T6_TimeZone {
	public static void main(String[] args) {
		String[] timeZoneID = TimeZone.getAvailableIDs();
		
		for(String id : timeZoneID ) {
			System.out.println(id);
		}
	}
}
