import static java.lang.System.out;
public class Que7 {
	public static void rotatebyOne(int[] arr){
		int tmp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=tmp;
	}
	public static void main (String[] args) {
		int arr[]={9,8,7,6,4,2,1,3};
		rotatebyOne(arr);
		for(int i:arr) out.println(i);
	}
}

