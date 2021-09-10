package example;
public class OccurenceofString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 15. find number of time "AB" in string str = "ABBBDFJGGDFABFJFHYDAB";
		//Count occurrence of a substring in a string using the indexOf method
		UsingSplitMethod();
		/*
		 * 
		 * String str = "ABBBDFJGGDFABFJFHYDAB"; String strFind = "AB"; int count = 0,
		 * fromIndex = 0;
		 * 
		 * while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
		 * 
		 * System.out.println("Found at index: " + fromIndex); count++; fromIndex++; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Total occurrences: " + count);
		 * 
		 */
}
	
	public static void UsingSplitMethod() {
//		 15. find number of time "AB" in string str = "ABBBDFJGGDFABFJFHYDAB";
		String str = "ABBBDFJGGDFABFJFHYDAB";
		 
		String[] st = str.split("AB",-1);
		//int count = ( str.split("AB", -1).length )-1 ;
		int count = st.length-1;
		System.out.println("Occrrences of AB string:  "+count);
	}
	
	
	
}




