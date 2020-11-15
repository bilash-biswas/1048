using System.IO;
using System;

class Program
{
    static void Main()
    {
    double a,c,b,d;
    a = Convert.ToDouble(Console.ReadLine());
    if(a >= 0.00 && a <= 400.00)
    {
        b = a * 0.15;
        c = a + b;
        d = 15;
        Console.WriteLine("Novo salario: " + string.Format("{0:0.00}", c));
        Console.WriteLine("Reajuste ganho: " + string.Format("{0:0.00}", b));
        Console.WriteLine("Em percentual: " + d + " %");
    }
    else if(a >= 400.01 && a <= 800.00)
    {
        b = a * 0.12;
        c = a + b;
        d = 12;
        Console.WriteLine("Novo salario: " + string.Format("{0:0.00}", c));
        Console.WriteLine("Reajuste ganho: " + string.Format("{0:0.00}", b));
        Console.WriteLine("Em percentual: " + d + " %");
    }
    else if(a >= 800.01 && a <= 1200.00)
    {
        b = a * 0.10;
        c = a + b;
        d = 10;
        Console.WriteLine("Novo salario: " + string.Format("{0:0.00}", c));
        Console.WriteLine("Reajuste ganho: " + string.Format("{0:0.00}", b));
        Console.WriteLine("Em percentual: " + d + " %");
    } 
    else if(a >= 1200.01 && a <= 2000.00)
    {
        b = a * 0.07;
        c = a + b;
        d = 7;
        Console.WriteLine("Novo salario: " + string.Format("{0:0.00}", c));
        Console.WriteLine("Reajuste ganho: " + string.Format("{0:0.00}", b));
        Console.WriteLine("Em percentual: " + d + " %");
    } 
    else if(a > 2000.00)
    {
        b = a * 0.04;
        c = a + b;
        d = 4;
        Console.WriteLine("Novo salario: " + string.Format("{0:0.00}", c));
        Console.WriteLine("Reajuste ganho: " + string.Format("{0:0.00}", b));
        Console.WriteLine("Em percentual: " + d + " %");
    }
    Console.ReadLine();
  }
}
