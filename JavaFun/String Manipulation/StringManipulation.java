public class StringManipulation {
    public static String trimAndConcat(String string1, String string2){
       	String string3 = string1.trim(); 
		String string4 = string2.trim();
		String string5 = string3.concat(string4);
		
        
        return string5;
    }
	public static Integer getIndexOrNull(String string, String ch){
        int a = string.indexOf(ch);
        
        return a;
    }
	public static String getIndexOrNull(String string1,int start,int end, String string2){
        
        String a =string1.substring(start,end);
		String x=a.concat(string2);
        return x;
    }

	
	
	
}