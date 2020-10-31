import static java.lang.System.out;
public class Que1 {
	public static void reverse(int arr[]){
		int len=arr.length;
		for(int i=0;i<len/2;i++){
			int tmp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=tmp;
		}
	}
	public static void main (String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		Que1.reverse(arr);
		for(int i:arr)
			out.println(i+" ");
	}
}

