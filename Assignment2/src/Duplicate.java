//Counting Duplicate Elements / Values in an Array by using Set Interface  method
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		
//		Considering an Array for Counting Duplicates elements
        int [] arr= {0,1,2,3,4,5,8,7,9,1,3,5,4};
        System.out.println("THE DUPLICATES IN AN ARRAY ARE FOLLOWS TYPES");
        Set<Integer> s=new HashSet<>();
        for(int elem:arr )
    {
        if(s.add(elem)==false)
        {
	      System.out.println(elem +",");
        }
    }
  }
        
}

