alter table LIB_READER add constraint FK_LIB_READER_ON_BOOK_CARD foreign key (BOOK_CARD_ID) references LIB_BOOK_CARD(ID);
create index IDX_LIB_READER_ON_BOOK_CARD on LIB_READER (BOOK_CARD_ID);
