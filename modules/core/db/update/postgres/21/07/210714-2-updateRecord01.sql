alter table LIB_RECORD rename column employee_id to employee_id__u60763 ;
alter table LIB_RECORD alter column employee_id__u60763 drop not null ;
alter table LIB_RECORD drop constraint FK_LIB_RECORD_ON_EMPLOYEE ;
drop index IDX_LIB_RECORD_ON_EMPLOYEE ;
