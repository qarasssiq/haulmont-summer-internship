-- update LIB_BOOK set LIBRARY_ID = <default_value> where LIBRARY_ID is null ;
alter table LIB_BOOK alter column LIBRARY_ID set not null ;
