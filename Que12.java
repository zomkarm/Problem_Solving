import static java.lang.System.out;
import java.util.Arrays;
public class Que12 { 
	//Wrong
	public static void merge1(int[] arr1,int[] arr2){
		int[] tmp=new int[arr2[arr2.length-1]+1];
		for(int i:arr1) tmp[i]=1;
		for(int i:arr2) tmp[i]=1;
		int a=0,b=0;
		for(int i=0;i<tmp.length;i++){
			if(i==arr1.length) break;
			if(tmp[i]==1){
				arr1[a++]=i;
				b++;
			}
		}
		a=0;
		for(int i=b;i<tmp.length;i++){
			if(tmp[i]==1){
				arr2[a++]=i;
			}
		}
	} 
	//Correct
	public static void merge2(int[] arr1,int[] arr2){
		int ar[]=new int[arr1.length+arr2.length];
		int i;
		for(i=0;i<arr1.length;i++) ar[i]=arr1[i];
		for(int j=0;j<arr2.length;j++) ar[i++]=arr2[j];
		Arrays.sort(ar);
		i=0;
		for(int j=0;j<arr1.length;j++){
			arr1[j]=ar[i++];
		}
		for(int j=0;j<arr2.length;j++){
			arr2[j]=ar[i++];
		}
		
	} 
	public static void main(String[] args) 
	{ 
		int arr1[] = new int[] {10,12}; 
		int arr2[] = new int[] {5,18,20}; 
		merge2(arr1,arr2);

		for(int i:arr1) out.println(i);
		out.println();
		for(int i:arr2) out.println(i);
		
	} 
} 
