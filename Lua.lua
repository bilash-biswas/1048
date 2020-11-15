a = io.read("*n")
if(a >= 0.00 and a <= 400.00)then
    b = a * 0.15
    c = a + b
    print("Novo salario: "..string.format( "%.2f", c ))
    print("Reajuste ganho: "..string.format( "%.2f", b ))
    print("Em percentual: 15 %")
end
if(a >= 400.01 and a <= 800.00)then
    b = a * 0.12
    c = a + b
    print("Novo salario: "..string.format( "%.2f", c ))
    print("Reajuste ganho: "..string.format( "%.2f", b ))
    print("Em percentual: 12 %")
end
if(a >= 800.01 and a <= 1200.00)then
    b = a * 0.10
    c = a + b
    print("Novo salario: "..string.format( "%.2f", c ))
    print("Reajuste ganho: "..string.format( "%.2f", b ))
    print("Em percentual: 10 %")
end
if(a >= 1200.01 and a <= 2000.00)then
    b = a * 0.07
    c = a + b
    print("Novo salario: "..string.format( "%.2f", c ))
    print("Reajuste ganho: "..string.format( "%.2f", b ))
    print("Em percentual: 7 %")
end
if(a > 2000.00)then
    b = a * 0.04
    c = a + b
    print("Novo salario: "..string.format( "%.2f", c ))
    print("Reajuste ganho: "..string.format( "%.2f", b ))
    print("Em percentual: 4 %")
end
