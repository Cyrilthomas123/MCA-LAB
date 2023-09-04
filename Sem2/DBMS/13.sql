set serveroutput on
declare
fact number(5);
num number(5);
begin
fact:=1;
num:=&num;
while num>0 loop
fact:=fact*num;
num:=num-1;
end loop;
dbms_output.put_line('factorial is' ||fact);
end;
/