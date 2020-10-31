import static java.lang.System.out;
public class Que2 {
	public static int max(int arr[]){
		int ma=Integer.MIN_VALUE;
		for(int i:arr){
			if(i>ma) ma=i;
		}
		return ma;
	}

	public static int min(int arr[]){
		int min=Integer.MAX_VALUE;
		for(int i:arr){
			if(i<min) min=i;
		}
		return min;
	}
	public static void main (String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		out.println(Que2.min(arr));
	}
}

