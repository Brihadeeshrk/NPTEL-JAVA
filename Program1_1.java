import java.util.Scanner;
class Program1_1{
    public static void Main(String[] args) {
        Scanner s = new Scanner(System.in); 
        double radius= s.nextDouble();
        double perimeter;
        double area;
	    perimeter = 2 * Math.PI * radius;
    	area = perimeter * radius;
	
        System.out.println(perimeter);
        System.out.println(area);
	}
}