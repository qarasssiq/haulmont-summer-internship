-- alter table LIB_READER add column LIBRARY_ID uuid ^
-- update LIB_READER set LIBRARY_ID = <default_value> ;
-- alter table LIB_READER alter column LIBRARY_ID set not null ;
alter table LIB_READER add column LIBRARY_ID uuid not null ;
