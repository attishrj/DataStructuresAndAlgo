package com.example.mvc;

public class MVCPattern {
	public static void main(String[] args) {
		Student model = retriveStudentFromDatabase();
		StudentView studentView=new StudentView();
		StudentController controller=new StudentController(model, studentView);
		controller.updateView();
		controller.setStudentName("Kumar");
		controller.updateView();
		
		
	}
	
	private static Student retriveStudentFromDatabase()
	{
		Student student=new Student();
		student.setName("ram ");
		student.setRollNo("421499");
		return student;
	}

}
