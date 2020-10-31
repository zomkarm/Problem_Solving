import static java.lang.System.out;
import java.util.Arrays;

public class Que14 { 
	public static void nextPermutate(int[] arr){
		int len=arr.length;
		if(len==1) return;
        if(len==2){
            int tp=arr[0];
            arr[0]=arr[1];
            arr[1]=tp; 
            return;
        }
		int a=0;
		for(int i=1;i<len;i++){
			if(arr[i-1]>arr[i]) a++;
		}
		if(a==len-1){
			Arrays.sort(arr);
			return;
		}
		Arrays.sort(arr);
		for(int i=1;i<len;i+=2){
			int tmp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tmp;
		}
	} 
	/*
	 * for cpp algorithm header contains next_permutation(arr.begin(),arr.end());
	 * 
	 */
	public static void main(String[] args) 
	{ 
		int arr[]={1,2};
		nextPermutate(arr);
		for(int i:arr) out.println(i);
	} 
} 
