package day7;

public abstract class Shape {
	
	public double calculateVolume(int len, int height){
		
		double  volume = calculateAreaOfBase(len) * height;
		
		return volume;
		
	}
	
	public abstract double calculateAreaOfBase(int len);
}
