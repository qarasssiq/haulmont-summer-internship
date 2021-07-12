-- begin LIB_BOOK
create table LIB_BOOK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    AUTHOR varchar(255) not null,
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end LIB_BOOK
-- begin LIB_LIBRARY
create table LIB_LIBRARY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end LIB_LIBRARY
-- begin LIB_BOOK_LIBRARY_LINK
create table LIB_BOOK_LIBRARY_LINK (
    LIBRARY_ID uuid,
    BOOK_ID uuid,
    primary key (LIBRARY_ID, BOOK_ID)
)^
-- end LIB_BOOK_LIBRARY_LINK
