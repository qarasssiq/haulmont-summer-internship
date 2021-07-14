alter table LIB_BOOK rename column employee_id to employee_id__u06971 ;
alter table LIB_BOOK drop constraint FK_LIB_BOOK_ON_EMPLOYEE ;
drop index IDX_LIB_BOOK_ON_EMPLOYEE ;
alter table LIB_BOOK rename column brought_date to brought_date__u19386 ;
alter table LIB_BOOK rename column taken_date to taken_date__u67528 ;
