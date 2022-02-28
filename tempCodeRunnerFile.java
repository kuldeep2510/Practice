import java.lang.*;

class tempCodeRunnerFile
{
      public static void main(String are[])
      {
            Demo dobj=new Demo(22,21);

            dobj.gun();
            

      }
}

class Demo
{
      public int x,y;
      Demo(int no,int po)
      {
            this.x=no;
            this.y=po;
            System.out.println(this.x+this.y);
      }

      public void fun()
      {
            System.out.println("Inside fun:"+this.y);
      }

      public void gun()
      {
           this.fun();
      }
}