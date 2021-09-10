package task;

public class LeapYear {
	 public void isLeapYear(int year)
	    {
	        boolean is_leap_year = false;
	 
	        if (year % 4 == 0) {
	  
	            if (year % 100 == 0) {
	                	                
	                if (year % 400 == 0) {
	                    is_leap_year = true;
	                }
	  
	                else {
	                    is_leap_year = false;
	                }
	            }
	  
	            // Out of if loop that is Non century year
	            // but divisible by 4, therefore leap year
	            is_leap_year = true;
	        }
	  
	        // If year is not divisible by 4
	        else
	  
	            // Flag dealing-  Non leap-year
	            is_leap_year = false;
	  
	        if (!is_leap_year) {
	            System.out.println(year + " : Non Leap-year");
	        }
	  
	        else {
	            System.out.println(year + " : Leap-year");
	        }
	    }

public static void main(String[] args) {
               LeapYear ob=new LeapYear();	
               ob.isLeapYear(2000);
              // LeapYear ob1=new LeapYear();
              
}

}


