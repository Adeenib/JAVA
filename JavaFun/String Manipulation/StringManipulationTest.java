public class StringManipulationTest{
  
    public static void main(String [] args){
		StringManipulation S= new StringManipulation();
		
		
		int A=S.getIndexOrNull("Hello","l");
		String X=S.getIndexOrNull("Hello",1,2, "World");
		String C =S.trimAndConcat("    Hello      ", "  World  ");
		System.out.println(C);
		
		System.out.println(A);
		System.out.println(X);
  }
  }