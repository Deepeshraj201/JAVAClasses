class Method1{

//Create a method
public static void method1(){
//Statement
String name="Ayesha";//local variable
System.out.println("My name is "+name);

}
public static void main(String[] args)
{
System.out.println("Main starts");
method1();
method1();
method1();
method1();
method2();
method2();
System.out.println("Main Ends");
}

static void method2(){//Method body or Method implementation

System.out.println("Method2 in a class");

}

}