/*Write a simple java application that sorts the integer numbers
passed through command line.*/
class u2p1
{
  public static void main(String args[])
   {
      int b[]=new int[args.length];
      int temp,i,j;
      for(i=0;i<args.length;i++)
       {
            b[i]=Integer.parseInt(args[i]);
       }
      for(i=0;i<args.length-1;i++)
       {
            for(j=0;j<args.length-i-1;j++)
             {
                 if(b[j]>b[j+1])
                  {
                      temp=b[j];
                      b[j]=b[j+1];
                      b[j+1]=temp;
                  }
             }
       }
       for(j=0;j<args.length;j++)
       {
           System.out.println(b[j]);
       }
    }
 
}
