package com.douzone.paint.shape;

import com.douzone.paint.i.Drawable;

//Shape을 상속받는 모든 클래스는 draw()를 사용하기 때문에 Shape에 인터페이스 구현
public abstract class Shape implements Drawable {
	private String lineColor;
	private String fillColor;
	
//	public abstract void draw();
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	

}
