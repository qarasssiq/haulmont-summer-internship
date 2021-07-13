-- begin LIB_LIBRARY
create unique index IDX_LIB_LIBRARY_UK_NAME on LIB_LIBRARY (NAME) where DELETE_TS is null ^
-- end LIB_LIBRARY
-- begin LIB_BOOK
alter table LIB_BOOK add constraint FK_LIB_BOOK_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
create index IDX_LIB_BOOK_ON_LIBRARY on LIB_BOOK (LIBRARY_ID)^
-- end LIB_BOOK
-- begin LIB_EMPLOYEE
alter table LIB_EMPLOYEE add constraint FK_LIB_EMPLOYEE_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
alter table LIB_EMPLOYEE add constraint FK_LIB_EMPLOYEE_ON_BOOK_CARD foreign key (BOOK_CARD_ID) references LIB_BOOK_CARD(ID)^
create index IDX_LIB_EMPLOYEE_ON_LIBRARY on LIB_EMPLOYEE (LIBRARY_ID)^
create index IDX_LIB_EMPLOYEE_ON_BOOK_CARD on LIB_EMPLOYEE (BOOK_CARD_ID)^
-- end LIB_EMPLOYEE
-- begin LIB_READER
alter table LIB_READER add constraint FK_LIB_READER_ON_BOOK_CARD foreign key (BOOK_CARD_ID) references LIB_BOOK_CARD(ID)^
create index IDX_LIB_READER_ON_BOOK_CARD on LIB_READER (BOOK_CARD_ID)^
-- end LIB_READER
-- begin LIB_BOOK_CARD
alter table LIB_BOOK_CARD add constraint FK_LIB_BOOK_CARD_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID)^
create index IDX_LIB_BOOK_CARD_ON_BOOK on LIB_BOOK_CARD (BOOK_ID)^
-- end LIB_BOOK_CARD
