alter table LIB_READER add constraint FK_LIB_READER_ON_LIBRARY foreign key (LIBRARY_ID) references LIB_LIBRARY(ID);
create index IDX_LIB_READER_ON_LIBRARY on LIB_READER (LIBRARY_ID);
