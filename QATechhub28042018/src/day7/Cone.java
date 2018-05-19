package day7;

public class Cone extends Shape{

	@Override
	public double areaOfShape(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

}
