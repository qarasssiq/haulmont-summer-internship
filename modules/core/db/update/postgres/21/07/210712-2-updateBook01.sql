alter table LIB_BOOK add constraint FK_LIB_BOOK_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID);
create index IDX_LIB_BOOK_ON_LIBRARY on LIB_BOOK (LIBRARY_ID);
