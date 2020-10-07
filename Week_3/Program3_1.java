import java.util.Scanner; //This package for reading input
public class Program3_1 { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 

    static int fib(int n) {
        int t1 = 0, t2 = 1, sum = 0;
        for(int i = 1; i <= n; i++ ) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return (sum-t1);
    }
}