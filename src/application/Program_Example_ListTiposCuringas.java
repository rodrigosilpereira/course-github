package application;

import java.util.ArrayList;
import java.util.List;

import entities.CircleTiposCuringa;
import entities.RectangleTiposCuringa;
import entities.ShapeTiposCuringa;

public class Program_Example_ListTiposCuringas {

	public static void main(String[] args) {
		
			List<ShapeTiposCuringa> myShapes = new ArrayList<>();
			myShapes.add(new RectangleTiposCuringa(3.0, 2.0));
			myShapes.add(new CircleTiposCuringa(2.0));
			
			List<CircleTiposCuringa> myCircles = new ArrayList<>();
			myCircles.add(new CircleTiposCuringa(2.0));
			myCircles.add(new CircleTiposCuringa(3.0));
			
			System.out.println("Total area: " + totalArea(myCircles));
		}
		
		public static double totalArea(List<? extends ShapeTiposCuringa> list) {
			double sum = 0.0;
			for (ShapeTiposCuringa s : list) {
				sum += s.area();
			}
			return sum;
		}

}


