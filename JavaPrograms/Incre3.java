class Incre3
{

public static void main(String[] args)
{

int a=1;
int b=1;
   //  2  + 1
  a=++a + b++;
   //  3   + 3
  b= a++ + ++b;
System.out.println(a);//4
System.out.println(b);//6



}
}