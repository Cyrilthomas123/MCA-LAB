set serveroutput on
create or replace procedure deposit(x in number,y in number)is
begin
update cust set amt=amt+y where accno=x;
commit;
end;
/
declare
a number(5);
b number(5);
begin
a:=&a;
b:=&b;
deposit(a,b);
end;
/