package com.example.mvc;

public class Student {
	  private String rollNo; 
	    private String name;
		public String getRollNo() {
			return rollNo;
		}
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		} 

}

class StudentView  {
	 public void printStudentDetails(String studentName, String studentRollNo) 
	    { 
	        System.out.println("Student: "); 
	        System.out.println("Name: " + studentName); 
	        System.out.println("Roll No: " + studentRollNo); 
	    } 
	
}
