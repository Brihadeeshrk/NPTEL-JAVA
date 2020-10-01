import java.util.Scanner;  
public class Program1_2 {
      
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
        	int x = s.nextInt(); 
        	int y = s.nextInt();
		int z = s.nextInt();
		int result = 0;
		if( x > y && x > z) {
			result = x;
		} else if( y > x && y > z) {
			result = y;
		} else if( z > y && z > x) {
			result = z;
		} else 
			result = x;
		System.out.print(result);
	}

}