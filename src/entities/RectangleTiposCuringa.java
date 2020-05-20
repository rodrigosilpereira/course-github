package entities;

public class RectangleTiposCuringa implements ShapeTiposCuringa {

	private double width;
	private double height;
	
	public RectangleTiposCuringa(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
