package com.company.lib.service;

import com.company.lib.entity.Book;
import com.company.lib.entity.Employee;
import com.company.lib.entity.Reader;
import com.company.lib.entity.Record;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

@Service(RecordService.NAME)
public class RecordServiceBean implements RecordService {
    @Inject
    private DataManager dataManager;

    @Override
    public boolean isDateCorrect(LocalDate takenDate, LocalDate broughtDate) {
        return broughtDate == null || takenDate.compareTo(broughtDate) != 1;
    }

    @Override
    public boolean isLibraryTheSame(Book book, Employee employee) {
        return book.getLibrary().getName().equals(employee.getLibrary().getName());
    }

    @Override
    public boolean isBookAlreadyTaken(Reader reader, Book book, Record record) {
        List <Record> records = dataManager.load(Record.class)
                .query("select e from lib_Record e where e.reader = :reader and" +
                        " e.book = :book and e.broughtDate is null")
                .parameter("reader", reader)
                .parameter("book", book)
                .list();
        if (records.size() != 0)
            if(records.get(0).equals(record))
                return false;
        return book.getIsTaken();
    }

    @Override
    public boolean isBookAlreadyTakenByReader(Reader reader, Book book, Record record) {
        List <Record> records = dataManager.load(Record.class)
                .query("select e from lib_Record e where e.reader = :reader and" +
                        " e.book.name = :bookName and e.book.author = :bookAuthor and e.broughtDate is null")
                .parameter("reader", reader)
                .parameter("bookName", book.getName())
                .parameter("bookAuthor", book.getAuthor())
                .list();
        return !(records.size() == 0 || records.get(0).equals(record));
    }
}