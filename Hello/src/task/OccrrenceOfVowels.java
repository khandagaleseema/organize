package task;

public class OccrrenceOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]= {'a','e','i','a','a','$','5'};
		//char aa='aeiou';
		int count = 0;
		for(int i=0;i<str.length;i++)
			//for(int i=str.length-1;i>0;i--)
		{
			
			if(str[i]=='a' || str[i] == 'e' || str[i]=='i' || str[i] == 'o' ||str[i]=='u')
			{
				System.out.println("Vowels are:"+str[i]);
				
			}
			else
				System.out.println("consonant"+str[i]);
			
			if(str[i]=='a'|| str[i]=='e')
			{
				count++;
			}
			
			
		}
		System.out.println("occurrence of a vowel:"+count);
	}

}

