import java.lang.*;
import java.util.HashMap;
import java.util.Scanner;

class Hashmap
{
      public static void main(String ar[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter String:");

            String s=sobj.nextLine();

            Marvellous mobj=new Marvellous();
            mobj.Cheakfrq(s);
      }
}
class Marvellous
{
      public void Cheakfrq(String s)
      {
            String s2=s.replaceAll(" ","");
            System.out.println(s2);

            char Arr []=s2.toCharArray();

            HashMap<Character,Integer> hobj=new HashMap();

            int i=0;
            for(char ch:Arr)
            {
                  if(hobj.containsKey(ch))
                  {
                        i=hobj.get(ch);
                        hobj.put(ch,i+1);
                  }
                  else 
                  {
                     hobj.put(ch,1);
                  }
            }
            
            System.out.println("Freq of each charachter:"+hobj);
      }
  
}

