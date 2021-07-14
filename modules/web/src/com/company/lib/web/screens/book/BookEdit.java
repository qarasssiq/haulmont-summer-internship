package com.company.lib.web.screens.book;

import com.company.lib.entity.Library;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Book;

import javax.inject.Inject;
import java.util.List;

@UiController("lib_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
    @Inject
    private DataManager dataManager;
    @Inject
    private DataContext dataContext;
    @Inject
    private TextField<String> nameField;
    @Inject
    private TextField<String> authorField;
    @Inject
    private PickerField<Library> libraryField;

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        List<Book> books = dataManager.load(Book.class)
                .query("select e from lib_Book e where e.name = :name and e.author = :author and e.library.name = :library")
                .parameter("name", nameField.getValue())
                .parameter("author", authorField.getValue())
                .parameter("library", libraryField.getValue().getName())
                .list();
        if(books.size() == 1) {
            books.get(0).setAmount(1);
            dataManager.commit(books.get(0));
        }
        else {
            Integer old_amount = books.get(0).getAmount();
            for(Book book: books) {
                book.setAmount(old_amount + 1);
                dataManager.commit(book);
            }
        }
    }
}