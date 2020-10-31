import static java.lang.System.out;
import java.util.Arrays;

public class Que15 { 
	//Method 1
	public static int inversion(int[] arr){
		int c=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j] && i<j) c++;
			}
		}
		return c;
	} 
	
	// Method 2
	static int getSum(int[] BITree, int index) 
	{ 
		int sum = 0; // Initialize result 
		while (index > 0) 
		{ 
			sum += BITree[index]; 
			index -= index & (-index); 
		} 
		return sum; 
	} 
	static void updateBIT(int[] BITree, int n, 
							int index, int val) 
	{ 
		while (index <= n) 
		{ 
			BITree[index] += val; 
			index += index & (-index); 
		} 
	} 
	static int getInvCount(int[] arr, int n) 
	{ 
		int invcount = 0; // Initialize result 
		int maxElement = 0; 
		for (int i = 0; i < n; i++) 
			if (maxElement < arr[i]) 
				maxElement = arr[i]; 
		int[] BIT = new int[maxElement + 1]; 
		for (int i = 1; i <= maxElement; i++) 
			BIT[i] = 0; 
		for (int i = n - 1; i >= 0; i--) 
		{ 
			invcount += getSum(BIT, arr[i] - 1); 
			updateBIT(BIT, maxElement, arr[i], 1); 
		}   
		return invcount; 
	} 
	
	//Method 3
	public static int mergeAndCount(int[] arr, int l, int m, int r) 
    { 
        int[] left = Arrays.copyOfRange(arr, l, m + 1); 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
        int i = 0, j = 0, k = l, swaps = 0; 
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i); 
            } 
        } 
        return swaps; 
    }   
    public static int mergeSortAndCount(int[] arr, int l, int r) 
    { 
        int count = 0; 
        if (l < r) { 
            int m = (l + r) / 2; 
            count += mergeSortAndCount(arr, l, m); 
            count += mergeSortAndCount(arr, m + 1, r); 
            count += mergeAndCount(arr, l, m, r); 
        } 
        return count; 
    } 
	public static void main(String[] args) 
	{ 
		int arr[]={2,4,1,3,5};
		out.println(getInvCount(arr,arr.length));
	} 
}
