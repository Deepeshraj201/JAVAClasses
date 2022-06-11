class sum_of_digit_of_number
{

public static void main(String[] args)
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
   System.out.println("Enter 1st number");
    int n=scn.nextInt();//443546/10=4
int p=n;
    int sum=0;//26   
   while(n>0)
   {
      int r=n%10;
          sum=sum+r;
         n=n/10;        
    }
 
       System.out.println("The sum of digit of the number "+p+" is "+sum);
}
}
