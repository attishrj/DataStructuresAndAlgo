package com.java.geeks.singleton.complete;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2931087985056832127L;
	private static Singleton obj;
	private String s="sigleton";
	private int i = 10;

	private Singleton() {
		System.out.println("Singleton.Singleton()");

	}

	/*public static Singleton getInstance() {
		if (null == obj) {
			obj = new Singleton();
		}
		return obj;
	}
	*/
	/*synchronized public static Singleton getInstance() {
		if (null == obj) {
			obj = new Singleton();
		}
		return obj;
	}*/
	
	//double lock 
	 public static Singleton getInstance() {
		if (null == obj) {
			synchronized (Singleton.class) {
				if (null == obj) {
				obj = new Singleton();
			}
			}
		
		}
		return obj;
	 }
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Singleton other = (Singleton) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Singleton [s=" + s + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	protected Object readResolve() {
        return obj;
    }
}
