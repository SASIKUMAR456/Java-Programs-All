package Arrays;

public class Assignment {
	public static void main(String[] args)
	{
		/*int[] a= {10,20,30,40,50};
		int sum=0;
	
		for(int i=0;i<a.length;i++)
		{
			
		sum=sum+a[i];
		
		}
		System.out.println("the total of sum " +sum);
	*//*
		 int [] a =  {25, 11, 7, 75, 56};
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			    if(a[i]>max)
				max=a[i];
		}
			System.out.println("the greatest value is " +max);
			*/

	
	int a[] = {10,20,30,6};
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("the smallest number "  +min);
	}
	
	}
	

