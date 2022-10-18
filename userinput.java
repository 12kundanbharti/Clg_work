
import java.util.*;
class userinput
{
    public static void main(String p[])
    {
        System.out.println("Welcome to Polytechnic College");
        Scanner s1= new Scanner(System.in);
        
        System.out.println("Please Enter value of x=");
        int x=s1.nextInt();    

        System.out.println("Please Enter value of y=");
        int y=s1.nextInt();  
        
        System.out.println("Addition of x and y is="+(x+y));
        System.out.println("Substaction of x and y is="+(x-y));
        System.out.println("Multplication of x and y is="+(x*y));
        System.out.println("Divison of x and y is="+(x/y));
    }
}