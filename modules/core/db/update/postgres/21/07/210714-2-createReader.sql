alter table LIB_READER add constraint FK_LIB_READER_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID);
create index IDX_LIB_READER_ON_BOOK on LIB_READER (BOOK_ID);
