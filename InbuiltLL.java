import java.util.LinkedList;
import java.util.Stack;

class InbuiltLL
{
      public static void main(String arg[])
      {
            Stack<Integer> list=new Stack<Integer>();

            list.add(11);
            list.add(12);
            list.add(13);
            list.add(14);
            list.add(17);

            list.pop();
            list.push(56);

            list.sort();

            System.out.println(list);

      }
}