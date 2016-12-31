import java.util.*;
import java.io.*;

class day_8{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      HashMap dict = new HashMap <String, Integer>(); 
      int N=in.nextInt();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         dict.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         
         if (dict.containsKey(s)) {
            System.out.println (s + "=" +dict.get (s));
         } else {
            System.out.println ("Not found");
         }
      }
   }
}
