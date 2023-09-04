set serveroutput on
create or replace trigger tt
after insert or update on cust
begin
if inserting then
insert into test values('done',SYSDATE);
else
insert into test values('update',SYSDATE);
end if;
end;
/