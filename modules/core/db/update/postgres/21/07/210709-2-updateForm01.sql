alter table LIB_FORM add constraint FK_LIB_FORM_ON_BOOK foreign key (BOOK_ID) references LIB_BOOK(ID);
create index IDX_LIB_FORM_ON_BOOK on LIB_FORM (BOOK_ID);
