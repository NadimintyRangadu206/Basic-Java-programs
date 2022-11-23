package com.opps.concepts;

 class School {
	 int noOfStudents;
	 int noOfClass;

	 public School(int noOfStudents, int noOfClass) {
		 System.out.println(noOfStudents+" " +noOfClass);
	 }
}
public class OppsTopics {

	String studentName;
	int rollNo;
	public void study() {
		studentName="somu";
		rollNo=12;
		System.out.println("Display the student details:"+ "\n\n"+studentName+" \t" +rollNo );
	}
	
	public static void main(String[] args) {
		OppsTopics topic=new OppsTopics();
	topic.study();
	School sc=new School(101,12);
	
	}
}
