package SpecialistCourses.Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SortNames {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String name;
		do {
		System.out.print("Введите имя?");
		name = sc.nextLine();
		names.add(name);
		} while (!name.isEmpty());
		Collections.sort(names);
		for(var p: names)
			System.out.println(p);
		sc.close();
	}

}
