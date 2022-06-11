class Condition3{


public static void main(String[] args)
{
// if elseif statement
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the 1st number");
int a=scn.nextInt();
System.out.println("Enter the 2nd number");
int b=scn.nextInt();
if(a>b)
{

System.out.println("a is bigger than b");
}else if(a<b)
{
System.out.println("a is smaller than b");
}else{

System.out.println("a is equal to b");
}


}
}