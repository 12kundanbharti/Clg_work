import java.util.*;
class obj 
{
    int x,y;
    Scanner s1= new Scanner(System.in);
void svp()
    {     
        System.out.println("Please Enter value of x=");
        int x=s1.nextInt();    

        System.out.println("Please Enter value of y=");
        int y=s1.nextInt(); 
        System.out.println("Substraction of x and y is="+(x+y));
    }
void clg()
{
        System.out.println("Please Enter value of x=");
        int x=s1.nextInt();    

        System.out.println("Please Enter value of y=");
        int y=s1.nextInt(); 
        System.out.println("Addition of x and y is="+(x-y));
}
void multi()
{
    System.out.println("multiplicaiton is="+(x*y));
}
public static void main(String v[])
{
    obj a1=new obj();
    a1.svp();
    a1.clg();
}
     
}