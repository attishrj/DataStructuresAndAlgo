package com.java.aboutenum;


public class EnumSwitch {
	public enum Day {
		
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
public static void main(String[] args) {
	Day[] dayOfWeek=Day.values();
	for(Day today:dayOfWeek)
	{
	  switch (today) {
	case MONDAY:
		
		break;
case TUESDAY:
		
		break;
	default:
		break;
	}	
	}
}
}
