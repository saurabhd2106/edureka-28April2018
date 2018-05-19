package day4;

public class Shape {
	
	//Area of square
	double calculateArea(int len){
		double area;
		
		area = len * len;
		
		return area;
	}
	

	
	//Area of rectangle
		double calculateArea(int len, int wid){
			double area;
			
			area = len * wid;
			
			return area;
		}
		
		//Area of circle
				double calculateArea(double rad){
					double area;
					
					area = Math.PI * rad * rad;
					
					return area;
				}

}
