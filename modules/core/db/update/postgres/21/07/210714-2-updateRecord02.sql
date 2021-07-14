-- alter table LIB_RECORD add column EMPLOYEE_ID uuid ^
-- update LIB_RECORD set EMPLOYEE_ID = <default_value> ;
-- alter table LIB_RECORD alter column EMPLOYEE_ID set not null ;
alter table LIB_RECORD add column EMPLOYEE_ID uuid not null ;
