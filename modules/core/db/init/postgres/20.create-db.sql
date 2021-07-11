-- begin LIB_FORM
alter table LIB_FORM add constraint FK_LIB_FORM_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID)^
alter table LIB_FORM add constraint FK_LIB_FORM_ON_READER foreign key (READER_ID) references LIB_READER(ID)^
alter table LIB_FORM add constraint FK_LIB_FORM_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references LIB_EMPLOYEE(ID)^
create index IDX_LIB_FORM_ON_BOOK on LIB_FORM (BOOK_ID)^
create index IDX_LIB_FORM_ON_READER on LIB_FORM (READER_ID)^
create index IDX_LIB_FORM_ON_EMPLOYEE on LIB_FORM (EMPLOYEE_ID)^
-- end LIB_FORM
-- begin LIB_BOOK
alter table LIB_BOOK add constraint FK_LIB_BOOK_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_BOOK_ON_LIBRARY on LIB_BOOK (LIBRARY_ID)^
-- end LIB_BOOK
-- begin LIB_EMPLOYEE
alter table LIB_EMPLOYEE add constraint FK_LIB_EMPLOYEE_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_EMPLOYEE_ON_LIBRARY on LIB_EMPLOYEE (LIBRARY_ID)^
-- end LIB_EMPLOYEE
-- begin LIB_READER
alter table LIB_READER add constraint FK_LIB_READER_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_READER_ON_LIBRARY on LIB_READER (LIBRARY_ID)^
-- end LIB_READER
