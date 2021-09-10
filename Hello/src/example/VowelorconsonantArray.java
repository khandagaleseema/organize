package example;

public class VowelorconsonantArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Using array
				char[] ch= {'a','e','w','x','i','o','a'};
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
				
						System.out.println("Occurrence of Vowel is:"+count);
						
						System.out.println("Occurrence of Consonant"+num);
		}
			

	}


