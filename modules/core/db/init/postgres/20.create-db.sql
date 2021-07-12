-- begin LIB_BOOK_LIBRARY_LINK
alter table LIB_BOOK_LIBRARY_LINK add constraint FK_BOOLIB_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID)^
alter table LIB_BOOK_LIBRARY_LINK add constraint FK_BOOLIB_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID)^
-- end LIB_BOOK_LIBRARY_LINK
