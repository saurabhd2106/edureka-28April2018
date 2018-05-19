package day7;

public abstract class Shape {
	
	public double volumeOfShape(double len, double height){
		
		double volume = areaOfShape(len) * height;
		
		return volume;
	}
	
	public abstract double areaOfShape(double len);

}
