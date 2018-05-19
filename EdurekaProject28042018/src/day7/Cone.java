package day7;

public class Cone extends Shape{

	@Override
	public double calculateAreaOfBase(int len) {
		return Math.PI * len * len;
	}

}
