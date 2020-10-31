import static java.lang.System.out;
import java.util.Arrays;

public class Que19 { 
	public static void transform(int arr[]) 
	{ 
		Arrays.sort(arr);
		int mid=0;
		for(int i=0;i<arr.length;i++) if(arr[i]>=0){ mid=i+1;break;}
		for(int i=1;i<mid;i+=2){
				int tmp=arr[i];
				arr[i]=arr[mid+i-1];
				arr[mid+i-1]=tmp;
		}
	} 
	public static void main(String[] args) 
	{
		int arr[]={-5,-2,5,2,4,7,1,8,0,-8};
		transform(arr);
		for(int i:arr) out.println(i);
	} 
}
