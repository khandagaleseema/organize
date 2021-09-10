package example;

public class SubstringFromgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	23. print substring between "AB" in string str = "ABBBDFJGGDFABFJFHYDAB";
		
		String str = "ABBBDFJGGDFABFJFHYDAB";
		System.out.println(str);
		int count = 0;
		//int num=0;
		String[] strarr = str.split("AB");
		
		for(int i=0;i<strarr.length;i++)
		{
		if(strarr[i]!="") {
			System.out.println(strarr[i]);
			//count++;
			
		}
		
		/*
		 * else { System.out.println(strarr[i]); num++; }
		 */
	
		}
		
	}

	
}
