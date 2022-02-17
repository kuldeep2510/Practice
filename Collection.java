import java.lang.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

class Collection
{
      public static void main(String arg[])
      {
            ArrayList <Integer> list=new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);

            System.out.println(list);

            for (int i : list) 
            {
                  System.out.println(i);
            }

            Stack <String> name=new Stack<>();

            name.push("kartik");
            name.push("mohan");
            name.push("sunil");

            System.out.println(name.clone());



            Queue<String> animal=new LinkedList<>();
            animal.offer("dog");
            animal.offer("cat");
            animal.offer("elephant");


            System.out.println(animal.remove());


            PriorityQueue<Integer> no=new PriorityQueue<>(Comparator.reverseOrder());
            no.offer(4);
            no.offer(1);
            no.offer(2);
            no.offer(3);
            no.offer(5);

            System.out.println(no.size());

            System.out.println(no);


            ArrayDeque<Integer> n=new ArrayDeque<>();
            n.offer(25);
            n.offer(26);
            System.out.println(n.size());

            System.out.println(n);


            
 
            Set<Integer> con=new HashSet<>();
            con.add(25);
            con.add(45);
            con.add(25);
            con.add(46);

            System.out.println(con);

            String p="mahender";
            String q="mahender";
            if(p.equals(q) )
            {
                  System.out.println("______");
            }


            Map<String,Integer> m=new HashMap<>();
            m.put("kuldeep",7);
            m.put("Aman", 786);
            m.put("Shradhha",8);
            m.put("anuj",5);

            System.out.println(m);

            System.out.println(m.values());



            Map<String,Integer> T=new TreeMap<>();
            T.put("kuldeep",7);
            T.put("Aman", 786);
            T.put("Shradhha",8);
            T.put("anuj",5);

            System.out.println(T);

            Scanner sobj=new Scanner(System.in);

            System.out.println("enter size of Array");
            int size=sobj.nextInt();

            int Arr[]=new int[size];

            for(int j=0;j<Arr.length;j++)
            {
                  Arr[j]=sobj.nextInt();
            }

            

            Arrays.sort(Arr);

            for (int k=0;k<Arr.length;k++) 
            {
                  
            
            System.out.print(Arr[k]+" ");
            }
            System.out.println(" ");

            System.out.println(Collections.min(con));


            
            

      }
}