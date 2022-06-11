class Armstrong_number
{

public static void main(String[] args)
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
   System.out.println("Enter 1st number");
    int n=scn.nextInt();//153
   int p=n;
    int sum=0;

    while(n!=0)
        {
         int r=n%10;
            sum=sum+r*r*r;
             n=n/10;

          }
                if(sum==p)
              {
                 System.out.println("Number "+p+" is a Armstrong number");
               }else{
                   System.out.println("Number "+p+" is not a Armstrong number");
                    }
}
}