set serveroutput on
create or replace procedure sq(x in out number)is
begin
x:=x*x;
end;
/
declare
x number(6);
begin
x:=&x;
sq(x);
dbms_output.put_line(x);
end;
/
