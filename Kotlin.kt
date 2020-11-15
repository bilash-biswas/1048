import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var b:Double
    var c:Double
    var a = read.nextDouble()
    if(a >= 0.00 && a <= 400.00)
    {
        b = a * 0.15;
        c = a + b;
        println("Novo salario: %.2f".format(c));
        println("Reajuste ganho: %.2f".format(b));
        println("Em percentual: 15 %");
    }
    if(a >= 400.01 && a <= 800.00)
    {
        b = a * 0.12;
        c = a + b;
        println("Novo salario: %.2f".format(c));
        println("Reajuste ganho: %.2f".format(b));
        println("Em percentual: 12 %");
    }
    if(a >= 800.01 && a <= 1200.00)
    {
        b = a * 0.10;
        c = a + b;
        println("Novo salario: %.2f".format(c));
        println("Reajuste ganho: %.2f".format(b));
        println("Em percentual: 10 %");
    }
    if(a >= 1200.01 && a <= 2000.00)
    {
        b = a * 0.07;
        c = a + b;
        println("Novo salario: %.2f".format(c));
        println("Reajuste ganho: %.2f".format(b));
        println("Em percentual: 7 %");
    }
    if(a > 2000.00)
    {
        b = a * 0.04;
        c = a + b;
        println("Novo salario: %.2f".format(c));
        println("Reajuste ganho: %.2f".format(b));
        println("Em percentual: 4 %");
    }
}

    
