import java.util.*;
public class Main
{  
public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in); 
        int a[][]=new int[10][10];    
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        System.out.println("Thumb rule:The first matrix's column size should be equal to the second matrix's row size");
        System.out.println("enter the row and column size of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("enter the row and column size of second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("you didnot follow the thumb rule shown before :( ");
            System.exit(0);
        }
        System.out.println("enter the numbers for 1st matrix");
        for(int i=0;i<r1;i++)
        {    
            for(int j=0;j<c1;j++)    
            { 
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the numbers for 2nd matrix");
        for(int i=0;i<r2;i++)
        {    
            for(int j=0;j<c2;j++)    
            { 
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("here is your final answer :)");
        for(int i=0;i<r1;i++)
        {    
            for(int j=0;j<c2;j++)    
            {    
                for(int k=0;k<r2;k++)      
                {      
                    c[i][j]+=a[i][k]*b[k][j];      
                }
              System.out.print(c[i][j]+" ");  
            }  
            System.out.println();   
        }    
    }
}  
