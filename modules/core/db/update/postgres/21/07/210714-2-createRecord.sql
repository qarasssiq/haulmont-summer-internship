alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_READER foreign key (READER_ID) references LIB_READER(ID);
alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID);
alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references LIB_EMPLOYEE(ID);
create index IDX_LIB_RECORD_ON_READER on LIB_RECORD (READER_ID);
create index IDX_LIB_RECORD_ON_BOOK on LIB_RECORD (BOOK_ID);
create index IDX_LIB_RECORD_ON_EMPLOYEE on LIB_RECORD (EMPLOYEE_ID);
