import java.util.Scanner;

class copyArray{
 
    public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		
		System.out.println("Elements In Array are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		
		System.out.println();		
		
		System.out.println("New Array are :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}	
		
    }
}