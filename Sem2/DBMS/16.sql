set serveroutput on
create or replace function strrev(str in varchar2)return varchar2 as
rev varchar2(30);
n number(5);
begin
n:=length(str);
for i in reverse 1..n loop
rev:=rev||substr(str,i,1);
end loop;
return rev;
end;
/
declare
a varchar2(30);
ans varchar2(30);
begin
a:='&a';
ans:=strrev(a);
dbms_output.put_line('reverse is'||ans);
end;
/