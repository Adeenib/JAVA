import java.util.ArrayList;
public class Basics{
	public static int[]  fromOneToN(){
		int[] arry;
		arry= new int[255];
		for (int i=0;i<255;i++){
			arry[i]=i+1;
			
		}
		return arry;
	}
	public static ArrayList<Integer>  oddNumber(){
		ArrayList<Integer> arry2=new ArrayList<Integer>();
		
		for (int x=1;x<255;x=x+2){
			arry2.add(x);
			
		}
		return arry2;
	}
		public static int  numberSum(int y){
		int sum=0;
		
		for (int x=1;x<=y;x++){
			sum+=x;
			
		}
		return sum;
	}
	public static void  printArry(int[] arry){
		  for (int element: arry) {
            System.out.println(element);
        }

			
		
	}
	public static Integer  maxNumber(int[] arry){
		int max=arry[0];
		  for (int element: arry) {
			  if (element>max){
				  max=element;
			  }
           
        }

			
		return max;
		
	}
		public static int  numberSumArry(int[] y){
		int sum=0;
		
		for (int x:y){
			sum+=x;
			
		}
		return sum;
	}
	public static ArrayList<Integer> greaterThan(int[] arry,int y){
		ArrayList<Integer> newarry=new ArrayList<Integer>();
		
		for (int x=0;x<arry.length;x++){
			if (x>y){
				newarry.add(x);
				
				
				
			}
			
		}
		return newarry;
	}
	public static void squareTheValues(int[] arry){
		for( int x=0;x<arry.length;x++){
			arry[x]=arry[x]*arry[x];
			System.out.println(arry[x]);
		}
		
		
	}
	public static void negativenumber(int[] arry){
		for( int x=0;x<arry.length;x++){
			if(arry[x]<0){
				arry[x]=0;
			}
			System.out.println(arry[x]);
		}
	}
	
}