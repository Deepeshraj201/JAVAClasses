class Multiplemethod{
//Method Overloading in java
public static void add(int a,int b){

System.out.println("Sum="+(a+b));
}
public static void add(int a,int b,int c){//number of parameter

System.out.println("Sum="+(a+b+c));
}
public static void add(double d1,double d2){//different type

System.out.println("Sum="+(d1+d2));
}
public static void main(String[] args)
{
System.out.println("Main starts");
add(34,54);
add(35,92,36);
add(36.3,43);
System.out.println("Main ends");
}

}