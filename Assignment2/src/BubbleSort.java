//CODE FOR BUBBLE / EXCHANGE / SINKING SORT
public class BubbleSort {
public static void main(String[] args)
{
	int [] a= {4,6,3,2,5,1};
	for(int i=0;i<a.length;i++)
	{ 
		for(int j=1;j<a.length;j++)
	{
		if(a[j]<a[j-1])
		{
			int tempVar=a[j];
			a[j]=a[j-1];
			a[j-1]=tempVar;
		}
	}
		
	}
	for(int elem:a) 
	
	{
		System.out.print(elem + " ");
	}
}
}
