alter table LIB_LIBRARY add constraint FK_LIB_LIBRARY_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID);
create index IDX_LIB_LIBRARY_ON_BOOK on LIB_LIBRARY (BOOK_ID);
