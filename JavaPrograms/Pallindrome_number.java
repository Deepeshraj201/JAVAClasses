class Pallindrome_number
{

public static void main(String[] args)
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
   System.out.println("Enter 1st number");
    int n=scn.nextInt();//1
     int p=n;
       int sum=0;//1234321
      while(n>0)
         {
          int r=n%10;
          sum=sum*10+r;
              n=n/10;
         }  
            
          if(sum==p)
               {
                 System.out.println("Number "+p+" is a pallindrome number");
                }else{
                 System.out.println("Number "+p+" is not a pallindrome number");    
                 }
     
 }
}