package homework.lesson04;

public class Student {
	
	int studentIdNumber;
	String name;
	String surName;
	int yearOfStudy;
	double averageRatingMath;
	double averageRatingEconomy;
	double averageRatingForeignLanguage;

}

class StudentTest {	
	
	double avgArifmetic(Student s) {
		
		double srednArifmOcenka = (s.averageRatingMath + s.averageRatingEconomy + 
				s.averageRatingForeignLanguage) / 3;
		
		System.out.println(s.studentIdNumber + " : " + (s.averageRatingMath + s.averageRatingEconomy + 
				s.averageRatingForeignLanguage) / 3 );
		
		return srednArifmOcenka;
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();		
		
		student1.studentIdNumber = 1;
		student1.name = "Roman";
		student1.surName = "Borodulia";
		student1.yearOfStudy = 2001;
		student1.averageRatingMath = 3f;
		student1.averageRatingEconomy = 2f;
		student1.averageRatingForeignLanguage = 2f;		
		 
		
		student2.studentIdNumber = 2;
		student2.name = "Mari";
		student2.surName = "Selivon";
		student2.yearOfStudy = 2002;
		student2.averageRatingMath = 5f;
		student2.averageRatingEconomy = 5f;
		student2.averageRatingForeignLanguage = 5f;	
		
		student3.studentIdNumber = 3;
		student3.name = "Sasha";
		student3.surName = "Tkach";
		student3.yearOfStudy = 2001;
		student3.averageRatingMath = 3f;
		student3.averageRatingEconomy = 3f;
		student3.averageRatingForeignLanguage = 3f;	
		
		StudentTest st = new StudentTest();
		st.avgArifmetic(student1);
		st.avgArifmetic(student2);
		st.avgArifmetic(student3);
		
	}	
}