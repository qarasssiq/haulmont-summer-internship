package com.company.lib.web.screens.bookcard;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.BookCard;

@UiController("lib_BookCard.edit")
@UiDescriptor("book-card-edit.xml")
@EditedEntityContainer("bookCardDc")
@LoadDataBeforeShow
public class BookCardEdit extends StandardEditor<BookCard> {
}