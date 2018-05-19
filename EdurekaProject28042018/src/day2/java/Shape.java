package day2.java;

public class Shape {
	
	
	int length;
	
	int width;
	
	int calculateArea(){
		
		int area;
		
		area = length * width;
		
		return area;
		
	}

	public static void main(String[] args) {
		Shape rectangle = new Shape();
		
		rectangle.length = 9000;
		
		rectangle.width = 100;
		
		int area =	rectangle.calculateArea();
		
		System.out.println("Area :: "+ area);
	}
}
