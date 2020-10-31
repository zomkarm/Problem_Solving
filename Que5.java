import static java.lang.System.out;
import java.util.Arrays;
public class Que5 {
	public static void moveNegativeMethod1(int[] arr){
		Arrays.sort(arr);
	}
	public static void moveNegativeMethod2(int[] arr){
		int ind=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				int tmp=arr[i];
				arr[i]=arr[ind];
				arr[ind]=tmp;
				ind++;
			}
		}
	}
	public static void main (String[] args) {
		int arr[]={-1,3,-2,5,-6,-7,2,-3,-9};
		moveNegativeMethod2(arr);
		for(int i:arr) out.println(i);
	}
}

