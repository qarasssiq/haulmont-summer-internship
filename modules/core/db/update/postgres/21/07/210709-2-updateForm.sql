alter table LIB_FORM rename column amount to amount__u61973 ;
alter table LIB_FORM alter column amount__u61973 drop not null ;
alter table LIB_FORM rename column author to author__u30540 ;
alter table LIB_FORM alter column author__u30540 drop not null ;
alter table LIB_FORM rename column name to name__u14149 ;
alter table LIB_FORM alter column name__u14149 drop not null ;
alter table LIB_FORM rename column book_id to book_id__u40435 ;
alter table LIB_FORM alter column book_id__u40435 drop not null ;
alter table LIB_FORM drop constraint FK_LIB_FORM_ON_BOOK ;
drop index IDX_LIB_FORM_ON_BOOK ;
alter table LIB_FORM rename column dtype to dtype__u96215 ;
-- alter table LIB_FORM add column BOOK_ID uuid ^
-- update LIB_FORM set BOOK_ID = <default_value> ;
-- alter table LIB_FORM alter column book_id set not null ;
alter table LIB_FORM add column BOOK_ID uuid not null ;
