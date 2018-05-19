package day3.java;

public class Shape {
	
	//Area of Square
	double calculateArea(int len){
		
		return (len * len);
		
	}
	
	//Area of Rectangle
	double calculateArea(int len, int wid){
		
		return (len * wid);
		
	}
	
	//Area of circle
	double calculateArea(double rad){
			
			return (Math.PI * rad * rad);
			
	}
	
	int calculateArea(int len, double wid){
		
		return (len * len);
		
	}
}
