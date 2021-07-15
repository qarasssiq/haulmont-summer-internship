package com.company.lib.service;

import com.company.lib.entity.Book;
import com.company.lib.entity.Record;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(BookService.NAME)
public class BookServiceBean implements BookService {
    @Inject
    private DataManager dataManager;

    @Override
    public boolean isTaken(Book book) {
        List<Record> records = dataManager.load(Record.class)
                .query("select e from lib_Record e where e.book = :book")
                .parameter("book", book)
                .list();
        if(records.size() == 0)
            return false;
        else {
            for (Record record : records) {
                if (record.getBroughtDate() == null)
                    return true;
            }
        }
        return false;
    }
}