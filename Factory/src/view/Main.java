package view;
import Model.FactoryPolygon;
import Model.Polygon;

public class Main {

	public static void main(String[] args) {

		Polygon triangle = FactoryPolygon.createPolygon(3);
		System.out.println(String.format("%S - %S", 3, triangle.getDescription()));

		Polygon square = FactoryPolygon.createPolygon(4);
		System.out.println(String.format("%S - %S", 4, square.getDescription()));

		Polygon pentagon = FactoryPolygon.createPolygon(5);
		System.out.println(String.format("%S - %S", 5, pentagon.getDescription()));

	}
}
