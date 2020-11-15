package main

import (
	"fmt"
)

func main() {
	var c, b, a float64
	fmt.Scan(&a)
	if a >= 0.00 && a <= 400.00 {
		b = a * 0.15
		c = a + b
		fmt.Printf("Novo salario: %.2f\n", c)
		fmt.Printf("Reajuste ganho: %.2f\n", b)
		fmt.Printf("Em percentual: %d %%\n", 15)
	}
	if a >= 400.01 && a <= 800.00 {
		b = a * 0.12
		c = a + b
		fmt.Printf("Novo salario: %.2f\n", c)
		fmt.Printf("Reajuste ganho: %.2f\n", b)
		fmt.Printf("Em percentual: %d %%\n", 12)
	}
	if a >= 800.01 && a <= 1200.00 {
		b = a * 0.10
		c = a + b
		fmt.Printf("Novo salario: %.2f\n", c)
		fmt.Printf("Reajuste ganho: %.2f\n", b)
		fmt.Printf("Em percentual: %d %%\n", 10)
	}
	if a >= 1200.01 && a <= 2000.00 {
		b = a * 0.07
		c = a + b
		fmt.Printf("Novo salario: %.2f\n", c)
		fmt.Printf("Reajuste ganho: %.2f\n", b)
		fmt.Printf("Em percentual: %d %%\n", 7)
	}
	if a > 2000.00 {
		b = a * 0.04
		c = a + b
		fmt.Printf("Novo salario: %.2f\n", c)
		fmt.Printf("Reajuste ganho: %.2f\n", b)
		fmt.Printf("Em percentual: %d %%\n", 4)
	}
}
