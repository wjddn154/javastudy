package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10, 10);
//		point1.setX(10);
//		point1.setY(10);

//		drawPoint(point1);
//		point1.disapear();
		point1.show(false);
		draw(point1);
		
		Point point2 = new ColorPoint(100, 200, "red");
		//ㅔoint2.setX(200);
		//point2.setY(300);
		//((ColorPoint)point2).setColor("yellow");
//		drawColorPoint((ColorPoint)point2);
//		drawPoint(point2);

		point2.show(false);
		point2.show(true);
		draw(point2);
		
//		Point point3 = new ColorPoint();
//		point3.setX(300);
//		point3.setY(400);
//		drawPoint(point3);
		
//		ColorPoint colorPoint1 = new ColorPoint();
//		colorPoint1.setX(100);
//		colorPoint1.setY(200);
//		colorPoint1.setColor("red");
//		drawColorPoint(colorPoint1);
		
		//삼각형 그리기
		Triangle triangle = new Triangle();
//		drawTriangle(triangle);
//		drawShape(triangle);
		draw(triangle);

		//사각형 그리기
		Rectangle rectangle = new Rectangle();
//		drawRectangle(rectangle);
//		drawShape(rectangle);
		draw(rectangle);

		//원 그리기
		Circle circle = new Circle();
//		drawCricle(circle);
//		drawSahpe(circle);
		draw(circle);
		
		GraphicText text = new GraphicText("Hellow World");
		draw(text);
		

		//instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		
		//오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다
//		System.out.println(circle instanceof Rectangle);
		
		//interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	

//	public static void drawPoint(Point point) {
//		point.show();
//	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
	
	
	
//	public static void drawTriangle(Triangle triangel) {
//		triangel.draw();
		
//	}
	
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
	
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
	
	
	
	
	
}
