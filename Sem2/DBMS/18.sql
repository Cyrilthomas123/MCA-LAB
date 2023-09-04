set serveroutput on
create or replace procedure minim(x in number,y in number,z out number)is
begin
if x<y then
z:=x;
else
z:=y;
end if;
end;
/
declare
a number(6);
b number(6);
c number(6);
begin
a:=&a;
b:=&b;
minim(a,b,c);
dbms_output.put_line(c);
end;
/

