package com.company.lib.service;

import com.company.lib.entity.Book;
import com.company.lib.entity.Employee;
import com.company.lib.entity.Reader;
import com.company.lib.entity.Record;

import java.time.LocalDate;

public interface RecordService {
    String NAME = "lib_RecordService";

    boolean isDateCorrect(LocalDate takenDate, LocalDate broughtDate);

    boolean isLibraryTheSame(Book book, Employee employee);

    boolean isBookAlreadyTaken(Reader reader, Book book, Record record);

    boolean isBookAlreadyTakenByReader(Reader reader, Book book, Record record);
}