package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName(String Name) {
		
		System.out.println("Student Name : " + Name);
	}
	
	public void studentDept(String Dept) {
		
		System.out.println("Student Dept : " + Dept);
	}
	
   public void studentId(int Id) {
	   
	   System.out.println("Student Id : " + Id);
   }
	
   public static void main(String[] args) {
	   
	   Student stud=new Student();
	   stud.collegeName("Providence college for women");
	   stud.collegeCode(997);
	   stud.collegeRank(1);
	   stud.deptName("BCA");
	   stud.studentName("Prabhu");
	   stud.studentDept("Computer Science");
	   stud.studentId(675432);
	   
	   

	   
	}

}
