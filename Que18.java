import static java.lang.System.out;
import java.util.HashMap;

public class Que18 { 
	public static void common1(int[] arr1,int[] arr2,int[] arr3){
		for(int i=0;i<arr1.length;i++){
			int c1=0,c2=0;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					c1++;break;
				}
			}
			for(int k=0;k<arr3.length;k++){
				if(arr1[i]==arr3[k]){
					c2++;break;
				}
			}
			if(c1==1 && c2==1) out.println(arr1[i]);
		}
	}
	
	public static void common2(int[] arr1,int[] arr2,int[] arr3){
		HashMap<Integer,Integer> mp1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mp2=new HashMap<Integer,Integer>();
		for(int i:arr2) mp1.put(i,1);
		for(int i:arr3) mp2.put(i,1);
		for(int i=0;i<arr1.length;i++){
			int c=0;
			Integer a=mp1.get(arr1[i]);
			Integer b=mp2.get(arr1[i]);
			if(a!=null && b!=null) c++;
			if(c==1) out.println(arr1[i]);
		}
	}
	
	public static void findCommon(int ar1[], int ar2[], int ar3[]) 
    { 
        int i = 0, j = 0, k = 0; 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
             else if (ar1[i] < ar2[j]) 
                 i++; 
             else if (ar2[j] < ar3[k]) 
                 j++; 
             else
                 k++; 
        } 
    } 
	public static void main(String[] args) 
	{ 
		int arr1[]={1, 5, 10, 20, 40, 80};
		int arr2[]={6, 7, 20, 80, 100};
		int arr3[]={3, 4, 15, 20, 30, 70, 80, 120};
		findCommon(arr1,arr2,arr3);
	} 
}
