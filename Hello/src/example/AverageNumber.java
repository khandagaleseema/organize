package example;

public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Calculate the average of  array numbers.
			      int i,total;
			      int a[] = {0,6,9,2,7};
			      int asize = a.length;
			      int n = 5;
			      total = 0;

			      for(i=0; i<asize; i++) {
			         total = total+a[i];
			      }
			      System.out.println("Average ::"+ total/(float)asize);
			   }
			
	
	
	}


