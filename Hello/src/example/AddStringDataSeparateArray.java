package example;

import java.util.Arrays;

public class AddStringDataSeparateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char
		String str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH #@";
		char[] ch = str.toCharArray();
		String []stri=new String[ch.length];
		System.out.println("Original Array"+Arrays.toString(stri));
		int stricount=0;
		
		String newitem=null;
		stri[stricount++]=newitem;	
		System.out.println(Arrays.toString(stri));
        int chara = 0, lower = 0, number = 0, special = 0;
        for(int i = 0; i < ch.length; i++)
        {
        	
            //char ch = str.charAt(i);
            if (ch[i] >= 'A' && ch[i] <= 'Z' && ch[i] >= 'a' && ch[i]<= 'z')
            {
            	chara++;
            
            }
            else if (ch[i] >= '0' && ch[i] <= '9')
                number++;
            else 
                special++;
        }
        //original array
        String[] colorsArray = {"Red", "Green", "Blue" };    
        System.out.println("Original Array: " + Arrays.toString(colorsArray));
 
        //length of original array
        int orig_length = colorsArray.length;
        //new element to be added to string array
        String newElement = "Orange";
        //define new array with length more than the original array
        String[] newArray = new String[ orig_length + 1 ];
        //add all elements of original array to new array
        for (int i=0; i <colorsArray.length; i++)
        {
            newArray[i] = colorsArray [i];
         }
        //add new element to the end of new array
        newArray[newArray.length- 1] = newElement;
        //make new array as original array and print it
        colorsArray = newArray;   
        System.out.println("Array after adding new item: " + Arrays.toString(colorsArray));
    }
	}


