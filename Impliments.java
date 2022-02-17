import java.lang.*;

class Impliments
{
      public static void main(String arg[])
      {
            Avon aobj=new Avon();
            aobj.Speedup();
            aobj.Horn();
            aobj.Fuel();

            
      }
}
interface Bycycle
{
      public void Speedup();
      public void Horn();

     

}
interface Byke
{
      public void Fuel();

}

class Avon implements Bycycle, Byke
{
      public void Speedup()
      {
            System.out.println("upto 50kmph");
      }
      public void Horn()
      {
            System.out.println("loud horn");
      }
      public void Fuel()
      {
            System.out.println("Petrol");
      }
      
}