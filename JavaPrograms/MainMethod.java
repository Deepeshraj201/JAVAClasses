class MainMethod{


public static void main(String[] args)
{
System.out.println("Main starts");
main("Testing");
main();
System.out.println("Main ends");
}


public static void main(String args)
{
System.out.println("Main method with String args="+args);

}

public static void main(){
System.out.println("Main method without any args");

}


}