create table LIB_BOOK_LIBRARY_LINK (
    LIBRARY_ID uuid,
    BOOK_ID uuid,
    primary key (LIBRARY_ID, BOOK_ID)
);
