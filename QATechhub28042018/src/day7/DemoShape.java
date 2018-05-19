package day7;

public class DemoShape {

	public static void main(String[] args) {
		
		Cuboid cubiod = new Cuboid();
		
		double volume  = cubiod.volumeOfShape(10, 5);
		
		System.out.println(volume);
		
		Shape cone = new Cone();
		
		System.out.println(cone.volumeOfShape(10, 5));

	}

}
