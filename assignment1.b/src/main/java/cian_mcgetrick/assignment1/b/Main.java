package cian_mcgetrick.assignment1.b;

import cian_mcgetrick.assignment1.Course;
import cian_mcgetrick.assignment1.Module;
import cian_mcgetrick.assignment1.Student;

public class Main {

	public static void main(String[] args) {
		
		Module m1 = new Module("OOP","CT210");
		Module m2 = new Module("DSP","BP456");
		Module m3 = new Module("Machine Learning","CT789");
		Module m4 = new Module("Communication","BP123");
		
		Course c1 = new Course("Computer Engineering","01/09/2018 00:00:00","01/05/2021 00:00:00");
		Course c2 = new Course("Computer Science","01/09/2018 00:00:00","01/05/2021 00:00:00");
		
		Student s1 = new Student("Cian McGetrick", 21, "02/09/1998",17280022,c1);
		Student s2 = new Student("Luke McGetrick", 22, "07/05/1998",17280078,c1);
		Student s3 = new Student("Steven Laffey", 20, "04/02/1998",17280134,c2);
		Student s4 = new Student("Harry Mak", 21, "03/09/1998",17280154,c2);
		
		m2.addStudents(s1);
		m2.addStudents(s2);
		m1.addStudents(s1);
		m1.addStudents(s2);
		m3.addStudents(s3);
		m3.addStudents(s4);
		m4.addStudents(s3);
		m4.addStudents(s4);
		
		s1.addModules(m2);
		s2.addModules(m2);
		s1.addModules(m1);
		s2.addModules(m1);
		s3.addModules(m3);
		s4.addModules(m3);
		s3.addModules(m4);
		s4.addModules(m4);
		
		c2.addModules(m3);
		c2.addModules(m4);
		c1.addModules(m1);
		c1.addModules(m2);
		
		m2.addModCourses(c1);
		m1.addModCourses(c1);
		m3.addModCourses(c2);
		m4.addModCourses(c2);
		
		System.out.println(c1.getCourseName());
		c1.getModuleList();
		System.out.println(c2.getCourseName());
		c2.getModuleList();
		
		
		System.out.println(s1);
		s1.getModules();
		System.out.println(s2);
		s2.getModules();
		System.out.println(s3);
		s3.getModules();
		System.out.println(s4);
		s4.getModules();
		
		
	}

}
