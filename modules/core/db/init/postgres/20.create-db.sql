-- begin LIB_LIBRARY
create unique index IDX_LIB_LIBRARY_UK_NAME on LIB_LIBRARY (NAME) where DELETE_TS is null ^
-- end LIB_LIBRARY
-- begin LIB_BOOK
alter table LIB_BOOK add constraint FK_LIB_BOOK_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_BOOK_ON_LIBRARY on LIB_BOOK (LIBRARY_ID)^
-- end LIB_BOOK
-- begin LIB_EMPLOYEE
alter table LIB_EMPLOYEE add constraint FK_LIB_EMPLOYEE_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_EMPLOYEE_ON_LIBRARY on LIB_EMPLOYEE (LIBRARY_ID)^
-- end LIB_EMPLOYEE
-- begin LIB_RECORD
alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_READER foreign key (READER_ID) references LIB_READER(ID)^
alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID)^
alter table LIB_RECORD add constraint FK_LIB_RECORD_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references LIB_EMPLOYEE(ID)^
create index IDX_LIB_RECORD_ON_READER on LIB_RECORD (READER_ID)^
create index IDX_LIB_RECORD_ON_BOOK on LIB_RECORD (BOOK_ID)^
create index IDX_LIB_RECORD_ON_EMPLOYEE on LIB_RECORD (EMPLOYEE_ID)^
-- end LIB_RECORD
