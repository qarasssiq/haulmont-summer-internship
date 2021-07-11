-- alter table LIB_EMPLOYEE add column LIBRARY_ID uuid ^
-- update LIB_EMPLOYEE set LIBRARY_ID = <default_value> ;
-- alter table LIB_EMPLOYEE alter column LIBRARY_ID set not null ;
alter table LIB_EMPLOYEE add column LIBRARY_ID uuid not null ;
