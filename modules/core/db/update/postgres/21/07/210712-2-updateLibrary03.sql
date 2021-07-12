alter table LIB_LIBRARY rename column book_id to book_id__u54820 ;
alter table LIB_LIBRARY drop constraint FK_LIB_LIBRARY_ON_BOOK ;
drop index IDX_LIB_LIBRARY_ON_BOOK ;
