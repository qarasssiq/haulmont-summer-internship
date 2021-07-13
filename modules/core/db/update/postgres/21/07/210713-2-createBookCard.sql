alter table LIB_BOOK_CARD add constraint FK_LIB_BOOK_CARD_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID);
create index IDX_LIB_BOOK_CARD_ON_BOOK on LIB_BOOK_CARD (BOOK_ID);
