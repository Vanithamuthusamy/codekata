import java.util.*;
class main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
           {
             a[i]=sc.nextInt(); 
           }
           for(int i=0;i<n;i++)
             {
            	sum=sum+a[i];
             }
          System.out.print(sum);
        }
       
    }
