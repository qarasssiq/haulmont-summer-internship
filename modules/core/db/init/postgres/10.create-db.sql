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
    AMOUNT integer,
    LIBRARY_ID uuid not null,
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
-- begin LIB_EMPLOYEE
create table LIB_EMPLOYEE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    LIBRARY_ID uuid,
    BOOK_CARD_ID uuid,
    --
    primary key (ID)
)^
-- end LIB_EMPLOYEE
-- begin LIB_READER
create table LIB_READER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    BOOK_CARD_ID uuid,
    --
    primary key (ID)
)^
-- end LIB_READER
-- begin LIB_BOOK_CARD
create table LIB_BOOK_CARD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BOOK_ID uuid not null,
    TAKEN_DATE date not null,
    BROUGHT_DATE date,
    --
    primary key (ID)
)^
-- end LIB_BOOK_CARD
