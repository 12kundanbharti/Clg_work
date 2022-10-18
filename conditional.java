/* Date: 13-09-2022
   Topic: Conditional Statement
   Author: Kundan Bharti
   
1. simple if --> true 
          if(a>b)    T F 
    if(condition)
    {
        statement ;
    } 
    
2. if-esle 
    if(condition)    T
    {
        statement ;
    }
    else             F
    {
         statement 
    }*/
    import java.util.*;
    class conditional
    {
       Scanner s1= new Scanner(System.in);
       int x, y;
        void execute()
        {
          System.out.println("Enter First Number:");
          x=s1.nextInt();
          
          System.out.println("Enter Second Number:");
          y=s1.nextInt();

          if(((x+y)/2==(x*y)-y)&&(x<y)||(x%y)==(y/x))
          {
            System.out.println("Addition is"+(x+y));
          }
          else
          {
            System.out.println("can't add this numbers");
          }
          
        }
        public static void main(String args[])
        {
         conditional con_obj= new conditional();
         con_obj.execute();
        }
    }