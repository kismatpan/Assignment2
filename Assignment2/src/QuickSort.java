// CODE for QuickSort
public class QuickSort {
		int partition(int [] a,int low ,int high)
		{
			// FOR SELECTING A PIVOT 
			int pivot=a[(low+high)/2];
			while(low<=high)
			{
				while(a[low]<pivot)
				{
					low++;
				}
				while(a[high]>pivot)
				{
					high--;
				}
				if(low<=high)
				{
					int temp=a [low];
					a[low]= a[high];
					a[high]=temp;
					
					low++;
					high--;
				}
			}
			return low;
		}
		// FOR RECURSION THE ARRAY
		public void quickSortRecursion(int []a , int low,int high)
		{
			int pi=partition(a,low,high);
			if(low<pi-1)
			{
				quickSortRecursion(a,low,pi-1);
			}
			if(pi<high)
			{
				quickSortRecursion(a,pi,high);
			}
		}
	//PRINTING  SORTED ARRAY 
		void printArray(int [] a )
		{
			for(int elem:a)
			{
				System.out.print(elem +" ");
			}
		}
		public static void main(String[] args) {
		int [] a= {7,2,6,4,5,1,3,8,0,9};
		int n=a.length;
		 QuickSort qs=new QuickSort();
		 qs.quickSortRecursion(a,0,n-1);
		 qs.printArray(a);

		}

	}


