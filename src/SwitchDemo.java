
public class SwitchDemo {

	
	public static void main(String[] args){ 	
	// TODO Auto-generated method stub
           
		//  declaring n i variables
    	//    	initializing days to 31 
		int n,i,days=31;
             System.out.println("enter the month:");
             n=1;
             // n value must be greater than 2 and should be odd number
             if(n>2 && n%2==1) 	 
             {
            	 // days value decreased to 1 i.,e 30 
            	 days=days-1;
             }
             // n value equals to 2 i.,e february   
             if(n==2){
            	 days=days-3;
             }
             // switching the n value 
             switch(n) 
             {
             // n value is 1
             case 1:
            	// n value is 1 for january 
            	 System.out.println("january:");
            	 // prints days
            	 for(i=1;i<=days;i++)
            		
             {
                System.out.println(i);
             }// case 1 breaks and loop ends
            	 break;
             
             // n value is 2
             case 2:
            	 // for n value is 2 for february
            	 System.out.println("february:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
          // n value is 3 
             case 3:
            	 System.out.println("March:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
          // n value is 4
            	 case 4:
            	 System.out.println("April:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
              
          // n value is 5
            	 case 5:
            	 System.out.println("May:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            	 
          // n value is 6
            	 case 6:
            	 System.out.println("June:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }
            	
            	 // n value is 7
             case 7:
            	 System.out.println("July:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            	 
          // n value is 8
             case 8:
            	 System.out.println("August:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            
          // n value is 9
             case 9:
            	 System.out.println("September:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            	 
          // n value is 10
             case 10:
            	 System.out.println("October:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            	 
          // n value is 11
             case 11:
            	 System.out.println("November:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
            	 
          // n value is 12
             case 12:
            	 System.out.println("December:");
            	 for(i=1;i<=days;i++)
             {
                System.out.println(i);
             }break;
	
             }    }
}


