package SpecialistCourses.Practice;

public class Point {
	public int x;
	public int y;
		
	//текущие координаты:
	public void draw(){
		System.out.print("Координаты точки: ");
		System.out.printf("X:%d : Y:%d", this.x, this.y);
	}
	
	//на сколько сдвинуть точку?
	public void moveBy(int dx, int dy){
		this.x+=dx;
		this.y+=dy;
	}
}
