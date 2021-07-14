alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references LIB_EMPLOYEE(ID);
create index IDX_LIB_RECORD_ON_EMPLOYEE on LIB_RECORD (EMPLOYEE_ID);
