// Subset = A subset of an array is a new array that contains some or all of the elements from the original array.
//CHECKING WHETHER THE A ARRAY IS SUBSET OF ANOTHER ARRAY

public class Subset {
	
		static boolean SubSet(int [] a, int [] b ,int m,int n)
		{
			int i,j=0;
			for ( i=0; i<n; i++ ) 
			{
				for( j=0; j<m; j++ )
				{
					if( b [i] == a[j] )
					{
						break;
					}
				}
				if( j==m )
				{
					return false;
				}
			}
			return true;
		}

		public static void main(String[] args) {
			int  [] a= {2,5,7,9,10,11,8,2,6,1};
			int [] b= {2,10,11,5,9};
			 
			int m=a.length;
			int n=b.length;
			
			if(SubSet(a,b,m,n))
			{
				System.out.println("b [] is the subset of a[]");
			}
			else
			{
				System.out.println("b [] is not subset of a [] ");
			}

		}

	}


