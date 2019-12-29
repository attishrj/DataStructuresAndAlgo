package com.java8;

public class Greetes implements Greeting {
	void greet(Greeting greeting) {
		greeting.perform();
	}
	
	

	public static void main(String[] args) {
		Greetes obj = new Greetes();
		HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
		obj.greet(helloWorldGreeting);
		/*myLambda doubleA=(int a)->{
			return a*2;
		};*/
	
		myLambda print=() ->System.out.println("Inside lambda");
		MyAdd addFunc=(int a,int b)->{
		return a=a+b;
		};
			
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub

	}
	
	interface myLambda{
		void m1();
		//int m2(int arg1);
		
	}
	interface MyAdd{
       int add(int x,int y);		
	}

}
