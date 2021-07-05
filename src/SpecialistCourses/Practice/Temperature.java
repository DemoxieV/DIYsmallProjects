package SpecialistCourses.Practice;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите температуру в градусах Цельсия: ");
		Double inC = sc.nextDouble();
		Double inF = inC*9/5+32;
		System.out.printf("Температура в Фарингейтах: %.3f \n", inF);
		sc.close();
	}

}
