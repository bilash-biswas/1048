var
c,b,a: double;
d:int64;
begin
   read(a);

   if((a >= 0.00) and (a <= 400.00))then
   begin
      b := a * 0.15;
      c := a + b;
      d := 15;
   end
   else if((a > 400.00) and (a <= 800.00))then
   begin
      b := a * 0.12;
      c := a + b;
      d := 12;
   end
   else if((a > 800.00) and (a <= 1200.00))then
   begin
      b := a * 0.10;
      c := a + b;
      d := 10;
   end
   else if((a > 1200.00) and (a <= 2000.00))then
   begin
      b := a * 0.07;
      c := a + b;
      d := 7;
   end
   else if(a > 2000.00)then
   begin
      b := a * 0.04;
      c := a + b;
      d := 4;
   end;
writeln('Novo salario: ', c:-1:2);
writeln('Reajuste ganho: ', b:-1:2);
writeln('Em percentual: ', d ,' %');
end.
