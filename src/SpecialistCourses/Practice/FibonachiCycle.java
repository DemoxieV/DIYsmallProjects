package SpecialistCourses.Practice;

public class FibonachiCycle {

	public static void main(String[] args) {
		int c = 1, a = 1, b = 1;
		 System.out.printf("%4d",a );
		 do {
		  System.out.printf("%4d", c);
		  c = a + b;
		  a = b;
		  b = c;
		 }
		 while (c<=1000);
		}

	}
