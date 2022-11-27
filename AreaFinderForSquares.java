package patika;
import java.util.Scanner;
public class AreaFinderForSquares {
	
public static void main(String[]args) {
 
System.out.print("Write the radius of your square : ");
 Scanner input = new Scanner(System.in);
 double r;
 r = input.nextDouble();; 
 
 double area;
   area = r * r * 3.14 ;
   System.out.print("The area of your square : " + area + " cm² ");

}
}