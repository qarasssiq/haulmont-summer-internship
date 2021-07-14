create table LIB_RECORD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    READER_ID uuid not null,
    TAKEN_DATE date not null,
    BROUGHT_DATE date,
    BOOK_ID uuid not null,
    EMPLOYEE_ID uuid not null,
    --
    primary key (ID)
);