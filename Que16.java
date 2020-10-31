import static java.lang.System.out;
import java.util.Arrays;

public class Que16 { 
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static int maxProfit(int[] pr) {
        int lo=Integer.MAX_VALUE;
        int hi=0;
		for(int i=0;i<pr.length;++i){
			lo=min(lo,pr[i]);
			hi=max(hi,pr[i]-lo);
		}
        return hi;
    }
	public static void main(String[] args) 
	{ 
		int arr[]={7,1,5,3,6,4};
		out.println(maxProfit(arr));
	} 
}
