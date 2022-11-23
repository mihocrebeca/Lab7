import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numar = 0;
        int n, m, x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduceti numarul de linii n= ");
        n=scanner.nextInt();
        System.out.println("\nIntroduceti numarul de coloane m= ");
        m=scanner.nextInt();
        int [][]t=new int[n][m];
        System.out.println("Introduceti elementele tabloului: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                System.out.println("i= "+i+" j= "+j);
                t[i][j]=scanner.nextInt();
            }
        System.out.println("x= ");
        x=scanner.nextInt();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                if(t[i][j]==x)
                    numar++;
            }
        System.out.print("Elementul apare de: "+numar+" ori.");
    }

}