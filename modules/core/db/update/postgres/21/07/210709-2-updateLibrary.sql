alter table LIB_LIBRARY add column NAME varchar(255) ^
update LIB_LIBRARY set NAME = '' where NAME is null ;
alter table LIB_LIBRARY alter column NAME set not null ;
