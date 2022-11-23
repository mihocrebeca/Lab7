import java.util.Scanner;

public class valMin {
    private static Scanner input;
    public static void main(String[] args) {
   int n;
   System.out.print("Introduceti numarul de elemente ale vectorului n=  ");
   input=new Scanner(System.in);
   n=input.nextInt();
   int v[]=new int[n];
   int i;

   for(i=0;i<n;i++){
       System.out.print("v["+i+"]=");
       v[i]=input.nextInt();

   }

   int min=v[0];
   for(i=1;i<n;i++)
       if(min>v[i]) min=v[i];
   System.out.println("Valoarea minima este: "+min);



    }
}