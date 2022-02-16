import java.util.Scanner;

class Innum
{
      public static void main(String Arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter string:");
            String inpuString=sobj.nextLine();



            for(int i=0;i<inpuString.length();i++)
            {
                 
                  for(int j=i;j<inpuString.length()-1;j++)
                  {
                    if(inpuString.charAt(j+1)!=1)
                        {
                              System.out.print(inpuString.charAt(j));
                        }
                        

                  }
                  System.out.println();

            }



      }
}