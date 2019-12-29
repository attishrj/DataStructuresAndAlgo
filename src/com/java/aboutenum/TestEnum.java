package com.java.aboutenum;

public class TestEnum {
	private enum LOAN{
		HOME_LOAN{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "HOME";
			}
		}
	}
	
	public static void main(String[] args) {
	LOAN homeLoan = LOAN.HOME_LOAN;
	System.out.println(homeLoan);
		String str="HOME";
		boolean res=str.equalsIgnoreCase(homeLoan.toString());
		System.out.println(res);
	}

}
