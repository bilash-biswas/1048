var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseFloat(lines.shift());

var c,b,d;
    if(a >= 0.00 && a <= 400.00)
    {
        b = a * 0.15;
        c = a + b;
        d = 15;
    }
    else if(a >= 400.01 && a <= 800.00)
    {
        b = a * 0.12;
        c = a + b;
        d = 12;
    }
    else if(a >= 800.01 && a <= 1200.00)
    {
        b = a * 0.10;
        c = a + b;
        d = 10;
    }
    else if(a >= 1200.01 && a <= 2000.00)
    {
        b = a * 0.07;
        c = a + b;
        d = 7
    }
    else if(a > 2000.00)
    {
        b = a * 0.04;
        c = a + b;
        d = 4;
    }
console.log("Novo salario: " + c.toFixed(2));
console.log("Reajuste ganho: " + b.toFixed(2));
console.log("Em percentual: " + d + " %");
