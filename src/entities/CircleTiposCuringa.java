package entities;

public class CircleTiposCuringa implements ShapeTiposCuringa {

	private double radius;

	public CircleTiposCuringa(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
