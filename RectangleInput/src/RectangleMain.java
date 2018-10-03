
import java.util.Scanner;
public class RectangleMain 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

        System.out.print("Enter Length of the Rectangle : ");
        double length = in.nextDouble();
        System.out.print("Enter Width of the Rectangle: ");
        double width = in.nextDouble();
        
        double area = length * width;
        double perimeter = 2*(length * width);
        double diagLength = Math.sqrt(Math.pow(length, 2)+ Math.pow(width, 2));
        

        System.out.printf("Area of Rectangle is            : %7.2f%n", area);
        System.out.printf("Perimeter of Rectanlge is       : %7.2f%n", perimeter);
        System.out.printf("Diagonal Length of Rectangle is : %7.2f%n", diagLength);
        
	}

}
 