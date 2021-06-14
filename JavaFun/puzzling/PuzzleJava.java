import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
public static void main(String[] args) {
	IntArray Array1 =new IntArray();
	System.out.println(Array1.theArray());
	ArrayList<String> Array2 =StrArray.theArray();
	ArrayList<String> Array3 =StrArray.greaterThan(Array2,5);
	ArrayList<Character> Array4 =Alphabet.fromAtoZ();
	ArrayList<Integer> Array5 =RandomNumber.tenNumber();
	System.out.println(Array2);
	Collections.shuffle(Array2);
	System.out.println(Array2);
	System.out.println(Array3);
	Collections.shuffle(Array4);
	System.out.println(Array4.get(Array4.size()-1));
	System.out.println(Array4.get(0));
	if(Array4.get(0)=='A'||Array4.get(0)=='E'||Array4.get(0)=='I'||Array4.get(0)=='O'||Array4.get(0)=='U'){
	System.out.println(Array4.get(0)+"  this latter is vowel latter");
	}
	System.out.println(Array5);
	Collections.sort(Array5);
	System.out.println(Array5);

	


	RandomString.randomString();
	
}


}