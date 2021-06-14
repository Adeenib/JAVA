import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class RandomNumber{
	
	public static ArrayList<Integer> tenNumber(){
		ArrayList<Integer> array =new ArrayList<Integer>();
		int low = 55;
		int high = 100;
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		for (int i=0;i<10;i++){
			
			Integer r = rand.nextInt(high-low) + low;
			array.add(r);
		}
	return array;
	}
}