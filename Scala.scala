object Main {
  def main(args:Array[String]){ 
    var a = scala.io.StdIn.readDouble()
    if(a >= 0.00 && a <= 400.00)
    {
        var b = a * 0.15
        var c = a + b
        println("Novo salario: %.2f".format(c))
        println("Reajuste ganho: %.2f".format(b))
        println("Em percentual: %d %%".format(15))
    }
    if(a >= 400.01 && a <= 800.00)
    {
        var b = a * 0.12
        var c = a + b
        println("Novo salario: %.2f".format(c))
        println("Reajuste ganho: %.2f".format(b))
        println("Em percentual: %d %%".format(12))
    } 
    if(a >= 800.01 && a <= 1200.00)
    {
        var b = a * 0.10
        var c = a + b
        println("Novo salario: %.2f".format(c))
        println("Reajuste ganho: %.2f".format(b))
        println("Em percentual: %d %%".format(10))
    }
    if(a >= 1200.01 && a <= 2000.00)
    {
        var b = a * 0.07
        var c = a + b
        println("Novo salario: %.2f".format(c))
        println("Reajuste ganho: %.2f".format(b))
        println("Em percentual: %d %%".format(7))
    }
    if(a > 2000.00)
    {
        var b = a * 0.04
        var c = a + b
        println("Novo salario: %.2f".format(c))
        println("Reajuste ganho: %.2f".format(b))
        println("Em percentual: %d %%".format(4))
    }
  }
}
