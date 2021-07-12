alter table lib_book drop constraint FK_LIB_BOOK_ON_LIBRARY ;
alter table lib_employee drop constraint FK_LIB_EMPLOYEE_ON_LIBRARY ;
alter table lib_reader drop constraint FK_LIB_READER_ON_LIBRARY ;
alter table lib_reader_library_link drop constraint FK_REALIB_ON_LIBRARY ;
