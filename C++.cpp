#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    double c,b,a;
    cin>>a;
    if(a >= 0.00 && a <= 400.00)
    {
        b = a * 0.15;
        c = a + b;
        cout<<"Novo salario: "<<fixed<<setprecision(2)<<c<<endl;
        cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<b<<endl;
        cout<<"Em percentual: 15 %"<<endl;
    }
    if(a >= 400.01 && a <= 800.00)
    {
        b = a * 0.12;
        c = a + b;
        cout<<"Novo salario: "<<fixed<<setprecision(2)<<c<<endl;
        cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<b<<endl;
        cout<<"Em percentual: 12 %"<<endl;
    }
    if(a >= 800.01 && a <= 1200.00)
    {
        b = a * 0.10;
        c = a + b;
        cout<<"Novo salario: "<<fixed<<setprecision(2)<<c<<endl;
        cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<b<<endl;
        cout<<"Em percentual: 10 %"<<endl;
    }
    if(a >= 1200.01 && a <= 2000.00)
    {
        b = a * 0.07;
        c = a + b;
        cout<<"Novo salario: "<<fixed<<setprecision(2)<<c<<endl;
        cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<b<<endl;
        cout<<"Em percentual: 7 %"<<endl;
    }
    if(a > 2000.00)
    {
        b = a * 0.04;
        c = a + b;
        cout<<"Novo salario: "<<fixed<<setprecision(2)<<c<<endl;
        cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<b<<endl;
        cout<<"Em percentual: 4 %"<<endl;
    }
    return 0;
}
