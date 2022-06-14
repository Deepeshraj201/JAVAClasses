class Strong_number
{

public static void main(String[] args)
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
   System.out.println("Enter 1st number");
    int n=scn.nextInt();//14
       int q=n;
      int sum=0;//120
while(n!=0)
    {
         int r=n%10;//1
          int i=1;
          int p=1;//1
                while(i<=r)
                 {
                    p=p*i;
                      i++;
                  }
               sum=sum+p; 
               n=n/10;
    }      

       if(sum==q)
          {
             System.out.println("Number "+q+ " is a Strong number");
          }else{
                System.out.println("Number "+q+ " is not a Strong number");
           }


}
}