package example;

public class SubstringVijay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			//18. Number of occurance of substring from given string 
	//String given = "My name is vijay. vijay is boy. vijay play cricket."  substring - vijay
			String str = "My name is vijay. vijay is boy. vijay play cricket.";
			 
			//int count = ( str.split("Java", -1).length ) - 1;
			 
			//System.out.println("Total occurrences: " + count);
			String[] st = str.split("vijay",-1);
			int count = st.length-1;
			System.out.println("From given String find occurrence of substring vijay :"+count);
		
	}

}
