package com.company.lib.web.screens.book;

import com.company.lib.service.BookService;
import com.company.lib.service.RecordService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Book;

import javax.inject.Inject;
import java.util.List;

@UiController("lib_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {
    @Inject
    private GroupTable<Book> booksTable;

    @Inject
    private DataManager dataManager;

    @Inject
    private BookService bookService;

    @Subscribe("removeBtn")
    public void onRemoveBtnClick(Button.ClickEvent event) {
        Book deletedBook = booksTable.getSingleSelected();
        List<Book> books = dataManager.load(Book.class)
                .query("select e from lib_Book e where " +
                        "e.name = :name and e.author = :author and e.library.name = :library")
                .parameter("name", deletedBook.getName())
                .parameter("author", deletedBook.getAuthor())
                .parameter("library", deletedBook.getLibrary().getName())
                .list();
        for(Book book: books) {
            if (!deletedBook.equals(book)){
                book.setAmount(books.size() - 1);
                dataManager.commit(book);
            }
        }
    }

    @Subscribe
    public void onInit(InitEvent event) {
        List<Book> books = dataManager.load(Book.class)
                .query("select e from lib_Book e")
                .list();
        for(Book book: books) {
            book.setIsTaken(bookService.isTaken(book));
            dataManager.commit(book);
        }
    }


}