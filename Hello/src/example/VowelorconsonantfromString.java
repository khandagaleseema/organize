package example;

public class VowelorconsonantfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str="vaishali";//v,s,h,l
		char ch[]=str.toCharArray();
		int count=0,num=0;
		System.out.println("Total length of array is : "+ch.length);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{ 
		System.out.println("Vowel is: " +ch[i]);
		count ++;
		   }
			
			else
			{
				System.out.println("Consonant is: " +ch[i]);
			num++;
			}

	     }
		System.out.println("Occurrences of vowel is: "+count);
		System.out.println("Occurrences of Consonant is: "+num);
	}
}

