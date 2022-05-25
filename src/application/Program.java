package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNome: ");

        System.out.print("\nGross salary: ");

        System.out.print("\nTax: ");

        sc.close();
    }
}
