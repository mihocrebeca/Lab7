import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Introduceti numarul de elemente ale vectorului n=  ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int v[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.print("v[" + i + "]=");
            v[i] = input.nextInt();

        }
        int poz = 0;
        int neg = 0;
        for (i = 0; i < n; i++)
            if (v[i] > 0)
                poz++;
        for (i = 0; i < n; i++)
            if (v[i] < 0)
                neg++;
        System.out.println("Vectorul contine " + poz + " elemente pozitive si " + neg + " elemente negative.");
    }
}