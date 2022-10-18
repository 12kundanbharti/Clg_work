/*class method program & Statements in Java
12-09-2022
author name = Kundan Bharti 
..............Here some Important Keys...........
1. we can create multiple objects in one class. 
2. Next topic- statements 
       > What is statement ? 
          sentance- collection of words or character.
      > Basically it has 3 types
          1.sequence statement 
          2.control/conditional statement/ dicision making statement
               > if statement 
               > if-else statement
               > nested if
            some more control statement are Break, switch and continue.
          3.looping statement -->  it has control statement 
               > for loop 
               > while loop 
               > do while loop
                */

class method  
{
    int y=10;   //Global variable..
 void very()
 {
   int x=20;    //Local variable..
   System.out.println("value of x="+(x+5));
 }
    public static void main(String args[])
    {
     method meth_obj= new method();
     meth_obj.very();
     System.out.println(meth_obj.y);
    }
}





































