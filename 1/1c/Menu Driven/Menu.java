import java.lang.*;
import java.util.Scanner;
class Menu
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x, r;
        do {
            System.out.println("\nOptions:\n1.Area of circle\n2.Perimeter of circle\n3.Exit");
            System.out.println("\nEnter option:");
            x=obj.nextInt();
            switch(x){
                case 1:System.out.println("\nEnter value of radius: ");
                       r=obj.nextInt();
                       System.out.println("Area of circle: " + (3.14*r*r));
                       break;
                case 2:System.out.println("\nEnter value of radius: ");
                       r=obj.nextInt();
                       System.out.println("Perimeter of circle: " + (2*3.14*r));
                       break;
                case 3:System.out.println("Exit");
                       break;
                default:System.out.println("\nInvalid option");
                        break;
            }
        }while(x!=3);
    }
}