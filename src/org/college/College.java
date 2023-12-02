package org.college;

public class College {
	public void collegeName() {
		System.out.println("COllege Name: GT ");
		}
	public void collegeCode() {
		System.out.println("College Code: 2585");
		
	}
	public void collegeRank() {
		System.out.println("College Rank: First Rank");
		
	}

	public static void main(String[] args) {
		College c=new College();
		Student s=new Student();
		Hostel h=new Hostel();
		Dept d=new Dept();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentId();
		s.studentDepartment();
		h.hostelName();
		d.hostelDeptName();
		
	}
}
