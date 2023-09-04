set serveroutput on
create or replace trigger t
before insert or update or delete on cust
for each row
when(new.accno>0)
declare
salarydiff number(10);
begin
salarydiff:=:new.amt-:old.amt;
dbms_output.put_line('diff'||salarydiff);
end;
/