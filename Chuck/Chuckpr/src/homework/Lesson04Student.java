package homework;

public class Lesson04Student {
	
	int studentIdNumber;
	String name;
	String surName;
	int yearOfStudy;
	float averageRatingMath;
	float averageRatingEconomy;
	float averageRatingForeignLanguage;
}

class StudentTest {
	
	public static void main(String[] args) {
		
		Lesson04Student student1 = new Lesson04Student();
		Lesson04Student student2 = new Lesson04Student();
		Lesson04Student student3 = new Lesson04Student();
	
		
		student1.studentIdNumber = 1;
		student1.name = "Roman";
		student1.surName = "Borodulia";
		student1.yearOfStudy = 2001;
		student1.averageRatingMath = 3f;
		student1.averageRatingEconomy = 2f;
		student1.averageRatingForeignLanguage = 2f;		
		
		System.out.println(student1.studentIdNumber + " : " + (student1.averageRatingMath + student1.averageRatingEconomy + 
				student1.averageRatingForeignLanguage) / 3 );
		
		student2.studentIdNumber = 2;
		student2.name = "Mari";
		student2.surName = "Selivon";
		student2.yearOfStudy = 2002;
		student2.averageRatingMath = 5f;
		student2.averageRatingEconomy = 5f;
		student2.averageRatingForeignLanguage = 5f;		
		
		System.out.println(student2.studentIdNumber + " : " + (student2.averageRatingMath + student2.averageRatingEconomy + 
				student2.averageRatingForeignLanguage) / 3 );
		
		student3.studentIdNumber = 3;
		student3.name = "Sasha";
		student3.surName = "Tkach";
		student3.yearOfStudy = 2001;
		student3.averageRatingMath = 3f;
		student3.averageRatingEconomy = 3f;
		student3.averageRatingForeignLanguage = 3f;		
		
		System.out.println(student3.studentIdNumber + " : " + (student3.averageRatingMath + student3.averageRatingEconomy + 
				student3.averageRatingForeignLanguage) / 3 );
		
	}	
}