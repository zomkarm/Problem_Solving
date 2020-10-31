import static java.lang.System.out;
import java.util.Arrays;

public class Que20 { 
	public static void subArrayWithZeroSum(int arr[]) 
	{ 
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
				}
				if(sum==0){
					out.println("YES");
					return;
				}
			}
		}
		out.println("NO");
	} 
	public static void main(String[] args) 
	{
		int arr[]={23,12,20,46,31,-45,-25};
		subArrayWithZeroSum(arr);
	} 
}
