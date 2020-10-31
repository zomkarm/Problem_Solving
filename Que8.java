import static java.lang.System.out;
import java.util.ArrayList;
public class Que8 {

	public static void maxSubArraySumMethod1(int[] arr){
		int ma=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
				}
				if(sum>ma) ma=sum;
			}
		}
		out.println(ma);
	}

	public static void maxSubArraySumMethod2(int[] arr){
		long curr_max = 0; 
        long result = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            curr_max += arr[i];
            if (curr_max < arr[i])
            {
                curr_max = arr[i];
            }
            if(result < curr_max)
                result = curr_max;
        }
        out.println(result);
	}

	public static void main (String[] args) {
		int arr[]={6, -3, -10, 0, 2};
		maxSubArraySumMethod2(arr);
	}
}

