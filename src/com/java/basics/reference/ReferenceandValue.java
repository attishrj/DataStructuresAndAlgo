 package com.java.basics.reference;

public class ReferenceandValue {
	int x;
	public ReferenceandValue() {
		x=0;
		
	}
	public ReferenceandValue(int i) {
		x=i;
		
	}
public static void main(String[] args) {
	ReferenceandValue obj=new ReferenceandValue(5);
	change(obj);
	System.out.println(change(obj).x);
}
private static ReferenceandValue change(ReferenceandValue obj) {
   //  obj=new ReferenceandValue();
     obj.x=10;
    return obj;
}

}
