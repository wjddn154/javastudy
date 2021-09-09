package paint;

public class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//어노테이션을 삭제하면 컴파일시 검사를 안할 뿐 오류가 생기진 않음
	@Override
	public void show() {
		System.out.println("점[x=" + getX() + ", y=" + getY() + ", colore=" + color + "]을 그렸습니다.");

	}
	
	
	
}
