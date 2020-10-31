import static java.lang.System.out;
import java.util.ArrayList;

public class Que22 {

	public static void maxSubArraySumMethod1(int[] arr){
		int ma=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int prod=1;
				for(int k=i;k<=j;k++){
					prod*=arr[k];
				}
				if(prod>ma) ma =prod;
			}
		}
		out.println(ma);
	}

	public static int maxProduct(int arr[]) 
    { 
		int n=arr.length;
        int minVal = arr[0]; 
        int maxVal = arr[0]; 
        int maxProduct = arr[0]; 
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] < 0) 
            { 
                int temp = maxVal; 
                maxVal = minVal; 
                minVal =temp; 
            }
            maxVal = Math.max(arr[i], maxVal * arr[i]); 
            minVal = Math.min(arr[i], minVal * arr[i]); 
            maxProduct = Math.max(maxProduct, maxVal); 
        }
        return maxProduct; 
    }

	public static void main(String[] args) {
		int arr[]={6, -3, -10, 0, 2};
		//maxSubArraySumMethod1(arr);
		out.println(maxProduct(arr));
	}
}
