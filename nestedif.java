/* Date: 19-09-2022
   Author: Kundan Bharti 
   Topic: Nested If statement(Multiple if)
   
   if(condition)
   {
    if(condition)
    {
        statement ......
    }
    else
    {
        if(condition)
        {

        }
    }
   } */
class nestedif
{
    int a=5;
    int b=7;
    void nes()
    {
        if(a>b)
        {
            System.out.println(a++);
            System.out.println(++b);
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(--b);
            System.out.println(--a);
            System.out.println(a--);
            System.out.println(b--);
        }
        else{
            System.out.println(a++);
            System.out.println(++b);
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(--b);
            System.out.println(--a);
            System.out.println(a--);
            System.out.println(b--);
        }
    }
    public.void.static.main(String arg[])
    {
     nestedif a1=new nestedif();
    }
}