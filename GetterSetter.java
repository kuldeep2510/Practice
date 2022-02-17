import java.lang.*;

class GetterSetter
{
      public static void main(String a[])
      {
            Account obj=new Account();
            String ab =obj.getPassword();

            System.out.println(ab);

      }
}
class Account
{
      public String name="kuldeep";
      protected String email="kuldeephajare2510@gmail.com";
      private String password="hajare";

      public String getPassword()
      {
            return this.password;
      }

      
}