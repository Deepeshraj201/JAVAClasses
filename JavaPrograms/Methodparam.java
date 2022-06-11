class Methodparam{

//Parameter 
private static String title(String name,int age)//default method
{

return "Name:-"+name+",Age:-"+age;
}
private static void title1(String title,double price)//default method
{

System.out.println("Name:-"+title+",Price:-Rs."+price);
}
 
 static int m1(int a,int b){
int sum=a+b;
return sum;

}
public static void main(String[] args)
{
System.out.println("Main starts");
System.out.println(title("Ayesha",25));//argument inside method
title1("Testing",263.37);

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the title");
String title=scn.next();
System.out.println("Enter price");
double d=scn.nextDouble();
title1(title,d);

int a=m1(43,54);
System.out.println(a);

System.out.println("Main ends");


}
}