import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class StrArray{
public static ArrayList<String> theArray(){
	ArrayList<String> array = new ArrayList<String>();
	array.add("Nancy");
	array.add("Jinichi");
	array.add("Fujibaya");
	array.add("Momochi");
	array.add("Ishikawa");
	
	return array;
	
}
public static ArrayList<String> greaterThan(ArrayList<String> array ,int y){
	ArrayList<String> array1  = new ArrayList<String>();;
	for (String x:array){
		if(x.length()>y){

			array1.add(x);
			
		}
			
	}
	return array1;
}
}