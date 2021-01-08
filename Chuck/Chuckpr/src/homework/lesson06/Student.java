package homework.lesson06;

public class Student {

	int id;
	String name;
	String surname;
	int course;
	double averageRatingMath;
	double averageRatingEconomy;
	double averageRatingForeignLanguage;
	
	Student (int id2, String name2, String surname2, int course2, double averageRatingMath2, double averageRatingEconomy2,
			double averageRatingForeignLanguage2) {
		
		id = id2;
		name = name2;
		surname = surname2;
		course = course2;
		averageRatingMath = averageRatingMath2;
		averageRatingEconomy = averageRatingEconomy2;
		averageRatingForeignLanguage = averageRatingForeignLanguage2;
		
	}
	
	Student (int id3, String name3, String surname3, int course3) {
		
		this(id3, name3, surname3, course3, 0.0, 0.0, 0.0);
		
	}
	
	Student () {
		
	}
	
}

class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Roman", "Borodulia", 1, 2.0, 3.0, 4.0);
		Student s2 = new Student(2, "Mari", "Selivon", 4);
		Student s3 = new Student();
		
		
		
	}
}