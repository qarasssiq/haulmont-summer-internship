package com.company.lib.web.screens.book;

import com.company.lib.entity.Library;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Book;

import javax.inject.Inject;

@UiController("lib_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
    @Inject
    private TextField<String> nameField;
    @Inject
    private TextField<String> authorField;
    @Inject
    private TextField<Integer> amountField;
    @Inject
    private DataManager dataManager;
    @Inject
    private Table<Library> libraryTable;

    private Book loadBookByNameAndAuthor(String name, String author) {
        libraryTable.getItems().getItems()
        return dataManager.load(Book.class)
                .query("select e from LIB_BOOK e where e.name=?1 and e.author=?2 and ", name, author)
                .one();
    }

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        Book ExistingBook = loadBookByNameAndAuthor(nameField.toString(), authorField.toString());
        if (ExistingBook != null) {
            ExistingBook.setAmount(ExistingBook.getAmount() + amountField.getValue());
            dataManager.commit(ExistingBook);
        }
    }
}