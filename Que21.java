import static java.lang.System.out;
import java.util.Arrays;

public class Que21 { 
	static int count=0;
	static void factorial(int n) 
    { 
        int res[] = new int[5000]; 
        res[0] = 1; 
        int res_size = 1; 
        for (int x = 2; x <= n; x++) 
            res_size = multiply(x, res, res_size); 
        out.println("Factorial of given number is :"); 
        for (int i = res_size - 1; i >= 0; i--){ 
            out.print(res[i]); 
			count++;
        }
    } 
    
    static int multiply(int x, int res[], int res_size) 
    { 
        int carry = 0;  
        for (int i = 0; i < res_size; i++) 
        { 
            int prod = res[i] * x + carry; 
            res[i] = prod % 10;   
            carry = prod/10;  
        } 
        while (carry!=0) 
        { 
            res[res_size] = carry % 10; 
            carry = carry / 10; 
            res_size++; 
        } 
        return res_size; 
    } 
    
	public static void main(String[] args) 
	{
		int n=100;
		factorial(n);
		out.println();
		out.println(count);
	} 
}
