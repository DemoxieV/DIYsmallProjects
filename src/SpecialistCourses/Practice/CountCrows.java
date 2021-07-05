package SpecialistCourses.Practice;
import java.util.Scanner;
public class CountCrows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Сколько ворон на ветке? (от 0 до 9): ");
		int c= sc.nextInt();
		if(c<0 || c>9) {
			System.out.println("Вы ввели неверное число!");
			System.exit(0);
		}
		String sn=switch (c) {
		case 1 -> "ворона";
		case 2,3,4 -> "вороны";
		default -> "ворон";	
		};
		System.out.printf("На ветке %d %s\n", c, sn);
		sc.close();
	}

}
