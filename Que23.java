import static java.lang.System.out;
import java.util.Arrays;

public class Que23 {

	public static void maxSubArraySumMethod(int[] arr){
		Arrays.sort(arr);
        int ans = 0, count = 1;
		for(int i = 1; i < arr.length; i++)
		{
			if (arr[i] == arr[i - 1] + 1)
				count++;
			else
				count = 1;
			ans = Math.max(ans, count);
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		int arr[]={2,6,1,9,4,5,3};
		maxSubArraySumMethod(arr);
	}
}
