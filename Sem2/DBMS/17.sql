set serveroutput on
create or replace function squarenum(x in number)return number is
sq number(10);
begin
sq:=x*x;
return sq;
end;
/
declare
square number(6);
begin
for i in 1..10 loop
square:=squarenum(i);
insert into square values(i,square);
end loop;
end;
/
