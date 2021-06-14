import java.util.*;
public class RandomString{
	
	public static void randomString(){
		ArrayList<Character> alpha= Alphabet.fromAtoZ();
		Random r= new Random();
		String randomStr=new String();
		for(int i=0;i<5;i++){
			randomStr+=alpha.get(r.nextInt(25));
		}
		System.out.print(randomStr);
	}
	
}