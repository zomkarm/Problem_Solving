import static java.lang.System.out;
public class Que11 { 
	//Time Compl :O(N^2)
	//Space : O(1)
	public static int dup1(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) return arr[i];
			}
		}
		return -1;
	} 

	//Time Compl :O(N)
	//Space : O(N)
	public static int dup2(int[] arr){ 
		int tmp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(tmp[arr[i]]==1) return arr[i];
			tmp[arr[i]]=1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{ 
		int arr[] = new int[] { 1, 3, 4, 2, 2}; 
		System.out.println(dup2(arr)); 
	} 
} 
