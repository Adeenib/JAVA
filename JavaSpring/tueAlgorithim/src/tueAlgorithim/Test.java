package tueAlgorithim;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		GeomitrecObject recPoly =  new Rectangle("blacj",true,50.69,30);
		System.out.println(((Rectangle) recPoly).getArea());
		System.out.println(recPoly.isFilled());
		ArrayList<GeomitrecObject> myArray = new ArrayList<GeomitrecObject>();
		myArray.add(new Rectangle());
		myArray.add(new Rectangle());
		myArray.add(new Circle());
		myArray.add(new Circle());
		System.out.println(myArray);
	}
	
}