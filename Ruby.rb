a = gets().chomp().to_f
if a >= 0.00 && a <= 400.00
   b = a * 0.15
   c = a + b
   printf("Novo salario: %.2f\n", c);
   printf("Reajuste ganho: %.2f\n", b);
   printf("Em percentual: 15 %%\n");
end
if a >= 400.01 && a <= 800.00
   b = a * 0.12
   c = a + b
   printf("Novo salario: %.2f\n", c);
   printf("Reajuste ganho: %.2f\n", b);
   printf("Em percentual: 12 %%\n");
end
if a >= 800.01 && a <= 1200.00
   b = a * 0.10
   c = a + b
   printf("Novo salario: %.2f\n", c);
   printf("Reajuste ganho: %.2f\n", b);
   printf("Em percentual: 10 %%\n");
end
if a >= 1200.01 && a <= 2000.00
   b = a * 0.07
   c = a + b
   printf("Novo salario: %.2f\n", c);
   printf("Reajuste ganho: %.2f\n", b);
   printf("Em percentual: 7 %%\n");
end
if a > 2000.00
   b = a * 0.04
   c = a + b
   printf("Novo salario: %.2f\n", c);
   printf("Reajuste ganho: %.2f\n", b);
   printf("Em percentual: 4 %%\n");
end
