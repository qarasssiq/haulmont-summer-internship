alter table LIB_FORM add constraint FK_LIB_FORM_ON_BOOK foreign key (BOOK_ID) references LIB_FORM(ID);
alter table LIB_FORM add constraint FK_LIB_FORM_ON_READER foreign key (READER_ID) references LIB_READER(ID);
alter table LIB_FORM add constraint FK_LIB_FORM_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references LIB_EMPLOYEE(ID);
create index IDX_LIB_FORM_ON_BOOK on LIB_FORM (BOOK_ID);
create index IDX_LIB_FORM_ON_READER on LIB_FORM (READER_ID);
create index IDX_LIB_FORM_ON_EMPLOYEE on LIB_FORM (EMPLOYEE_ID);
