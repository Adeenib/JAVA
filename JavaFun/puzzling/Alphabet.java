import java.util.ArrayList;
public class Alphabet{
public static ArrayList<Character> fromAtoZ(){
ArrayList<Character> array = new ArrayList<Character>();

	for(Character c = 'A'; c <= 'Z'; ++c){
	 array.add(c);
	 
	}
	return array;
}	

}