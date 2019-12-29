package com.java.aboutenum;

enum CoffeeSize {
	BIG(8), HUGE(10), OVERWHELMING(16);
	 CoffeeSize(int ounces) {
		 this.ounces=ounces;
	}
	 
	 
	 private int ounces;
	 public int getOunces() {
		 return ounces;
		 }
}

public class Coffee {
	CoffeeSize size;
	public static void main(String[] args) {
		Coffee coffee=new Coffee();
		coffee.size=CoffeeSize.BIG;
		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.OVERWHELMING;	
		
		//System.out.println("Coffee.main()"+coffee.size.getOunces());
		//System.out.println("Coffee.main()"+drink2.size.getOunces());
		CoffeeSize[] values ;
	for(CoffeeSize cs:CoffeeSize.values())
	{
		System.out.println("Coffee.main()"+cs.getOunces());
	}
		
		
		
		
	}

}
