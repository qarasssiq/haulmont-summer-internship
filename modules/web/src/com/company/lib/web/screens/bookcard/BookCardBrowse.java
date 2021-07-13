package com.company.lib.web.screens.bookcard;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.BookCard;

@UiController("lib_BookCard.browse")
@UiDescriptor("book-card-browse.xml")
@LookupComponent("bookCardsTable")
@LoadDataBeforeShow
public class BookCardBrowse extends StandardLookup<BookCard> {
}