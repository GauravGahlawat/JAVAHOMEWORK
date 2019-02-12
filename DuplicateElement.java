import java.util.Scanner;

class DuplicateElement{
 
    public static void main(String[] args)
	{
		int arr[]={1,2,3,4,7,8,3,6,5,2,10,45,78,95,41,45};
		System.out.println("Duplicate Elements are :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
    }
}