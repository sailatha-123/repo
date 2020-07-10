import java.io.*;
import java.util.*; 
public class Main1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    double sum=0.0,f=-1.0,f1,f2;
	    while(true)
	    {
    	    System.out.println(" 1.add\n 2.sub\n 3.mul\n 4.division\n 5.modulus\n 6.exit\n");
    	    int num=sc.nextInt();
    	    switch(num)
    	    {
    	        case 1 : System.out.println("enter the numbers to add and atlast enter zero ");
                	        while(f!=0)
                	        {
                	            f = sc.nextFloat();
                	            sum=sum+f;
                	        }
                	        System.out.println(sum);
    	        break;
    	        case 2 : System.out.println("enter two numbers to subtract");
                	        f1 = sc.nextFloat();
                	        f2 =sc.nextFloat();
                	        System.out.println(f1-f2);
    	        break;
    	        case 3 : System.out.println("enter two numbers to multiply");
            	           f1 = sc.nextFloat();
            	           f2 = sc.nextFloat();
            	           System.out.println(f1*f2);
        	    break;
        	    case 4 : System.out.println("enter two numbers to divide ");
        	                f1 = sc.nextFloat();
        	                f2 = sc.nextFloat();
        	                System.out.println(f1/f2);
    	        break;
    	        case 5 : System.out.println("enter two numbers to get modulus value");
        	                f1 = sc.nextFloat();
        	                f2 = sc.nextFloat();
        	            System.out.println(f1%f2);
    	        break;  
    	        case 6:System.exit(0);
    	        break;
    	       }
	    }
	}
}
