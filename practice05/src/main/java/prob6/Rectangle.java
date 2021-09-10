package prob6;

public class Rectangle extends Shape implements Resizable {
	
	private double width;
	private double height;
	
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
	
	
	//생성자
	public Rectangle() { }
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	public double getArea() {
		double area = width * height;

		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (width + height) * 2;
		
		return perimeter;
	}

	@Override
	public void resize(double s) {
		
		this.width = width * s;
		this.height = height * s;
		
		getArea();
		getPerimeter();
		
	}

}
