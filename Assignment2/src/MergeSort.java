//CODE FOR MERGE SORT 
//for Merging Individuals 
public class MergeSort {
		public static void Conquer(int arr [],int si,int mid,int ei)
		{
			int merged [] = new int [ei-si+1];
			int index1=si;
			int index2=mid+1;
			int x=0;
			while(index1<=mid && index2<=ei)
			{
				if(arr[index1]<=arr[index2])
				{
					merged[x++]=arr[index1++];
					//x++ ; index1++;
				}
				else
				{
					merged[x++]=arr[index2++];
				}
			}
			while(index1<=mid)
			{
				merged[x++]=arr[index1++];
	          //x++;   index1++;			
			}
			while(index2<=ei)
			{
				merged[x++]=arr[index2++];
			}
			for(int i=0 ,  j=si; i<merged.length;i++,j++)
			{
				 arr[j]=merged[i];
			}
		} 
//		for  Divide the array in sub array, to get indiviual elements
	 public static void Divide(int arr[],int si, int ei)
	 {
		 if(si>=ei)
		 {
			 return;
		 }
		 // to divide an array in two parts ,so that for partition we are using below formula
		 int mid=si+(ei-si)/2;
		 //(si+ei)/2 instead of these we're writing above formula 
		 //,Because it can be out of reach sometime
		 Divide(arr,si,mid);
		 Divide(arr,mid+1,ei);
		 Conquer(arr,si,mid,ei);
		 
		 
	 }
		public static void main(String[] args)
		{
			int arr[]= {6,3,9,5,2,8};
			int n=arr.length;
			Divide(arr,0,n-1);
			// n-1 because of condition
			// for printing sorted array
			for(int i=0;i<n;i++) 
			{
				System.out.print(arr[i]+ " ");
			}
			
	       System.out.println();
		}

	}


