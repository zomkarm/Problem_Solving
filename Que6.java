import static java.lang.System.out;
public class Que6 {
	public static void union(int[] arr1,int[] arr2){
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]) out.println(arr1[i++]);
			else if(arr2[j]<arr1[i]) out.println(arr2[j++]);
			else{
				out.println(arr1[i]);
				i++;j++;
			}
		}
		while(i<arr1.length) out.println(arr1[i++]);
		while(j<arr2.length) out.println(arr2[j++]);
	}
	public static void intersection(int[] arr1,int[] arr2){
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]) i++;
			else if(arr2[j]<arr1[i]) j++;
			else{
				out.println(arr1[i]);
				i++;j++;
			}
		}
		
	}
	public static void main (String[] args) {
		int arr1[]={1, 3, 4, 5, 7};
		int arr2[]={2, 3, 5, 6};
		intersection(arr1,arr2);
	}
}

