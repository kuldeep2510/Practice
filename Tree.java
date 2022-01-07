import java.util.Scanner;

public class Tree
{
      public static void main(String[] arg)
      {
          Node root=createTree();
      }
      static Scanner sc=new Scanner(System.in);
      static Node createTree()
      {
            Node root=null;
            System.out.println("Enter Data:");
            int data=sc.nextInt();

            if(data==-1)
            {
                  return null;
            }

            root=new Node(data);

            System.out.println("enter left for"+data);
            root.left=createTree();

            System.out.println("enter right for "+data);
            root.right=createTree();

            return root;
      }
}

class Node
{
      Node left,right;
      int data;


      public Node(int data)
      {
            this.data=data;
      }
}