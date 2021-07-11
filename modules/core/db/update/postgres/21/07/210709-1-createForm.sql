create table LIB_FORM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    BOOK_ID uuid not null,
    READER_ID uuid not null,
    TAKEN_DATE date not null,
    BROUGHT_DATE date,
    EMPLOYEE_ID uuid not null,
    --
    -- from lib_Book
    NAME varchar(255) not null,
    AUTHOR varchar(255) not null,
    AMOUNT integer not null,
    --
    primary key (ID)
);