import java.util.Scanner;

class PrimeNumbers
{
	public static void main (String[] args)
	{		
		int i,num;
        System.out.println("Enter Number of items :");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		System.out.println("Prime numbers from 1 to 1000 are :");
       	for (num = 1;num<=n; num++)         
		{ 		 
			int count=0;
			//for(num=i;num>=1;num--)
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if (count==0 && num!=1)
			{
				System.out.print(num+"\t");
			}	
		}	
   }
}