set serveroutput on
create or replace function maxim(x in number,y in number)
return number is
z number;
begin
if x>y then
z:=x;
else
z:=y;
end if;
return z;
end;
/
declare
a number(5);
b number(6);
c number(5);
begin
a:=&a;
b:=&b;
c:=maxim(a,b);
dbms_output.put_line('yes'||c);
end;
/
