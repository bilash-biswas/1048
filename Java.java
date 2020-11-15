import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double c,b,a;
    a = input.nextDouble();
    if(a >= 0.00 && a <= 400.00)
    {
        b = a * 0.15;
        c = a + b;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", b);
        System.out.printf("Em percentual: %d %%\n", 15);
    }
    if(a >= 400.01 && a <= 800.00)
    {
        b = a * 0.12;
        c = a + b;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", b);
        System.out.printf("Em percentual: %d %%\n", 12);
    }
    if(a >= 800.01 && a <= 1200.00)
    {
        b = a * 0.10;
        c = a + b;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", b);
        System.out.printf("Em percentual: %d %%\n", 10);
    }
    if(a >= 1200.01 && a <= 2000.00)
    {
        b = a * 0.07;
        c = a + b;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", b);
        System.out.printf("Em percentual: %d %%\n", 7);
    }
    if(a > 2000.00)
    {
        b = a * 0.04;
        c = a + b;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", b);
        System.out.printf("Em percentual: %d %%\n", 4);
    }
  }
}
