package day7;

public class DemoShape {

	public static void main(String[] args) {
		
		Cuboid Cuboid = new Cuboid();
		
	double volume =	Cuboid.calculateVolume(10, 5);

	System.out.println(volume);
	
	Cone cone = new Cone();
	
	volume =	cone.calculateVolume(10, 5);

	System.out.println(volume);
	
	
	}

}
