import java.util.Scanner;
public class Program1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
			//Use while loop check the number is Armstrong or not.
			//store the output(1 or 0) in result variable
		int temp,sum = 0;
		temp=n;
		while(n!=0) {
			temp/=10;
			sum += Math.pow(temp,3);
            n /=10;	
        }
        if(sum == temp) System.out.print("1");
        else System.out.print("0");
	}
}