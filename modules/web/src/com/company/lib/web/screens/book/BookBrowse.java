package com.company.lib.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Book;

@UiController("lib_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {
}