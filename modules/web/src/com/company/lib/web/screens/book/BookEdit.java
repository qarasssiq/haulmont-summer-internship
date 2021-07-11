package com.company.lib.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Book;

@UiController("lib_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
}