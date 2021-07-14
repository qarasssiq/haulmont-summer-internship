package com.company.lib.web.screens.record;

import com.company.lib.entity.Book;
import com.company.lib.entity.Employee;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Record;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Map;

@UiController("lib_Record.edit")
@UiDescriptor("record-edit.xml")
@EditedEntityContainer("recordDc")
@LoadDataBeforeShow
public class RecordEdit extends StandardEditor<Record> {
    @Inject
    private DateField<LocalDate> takenDateField;

    @Inject
    private DateField<LocalDate> broughtDateField;

    @Inject
    private PickerField<Book> bookField;

    @Inject
    private PickerField<Employee> employeeField;

    @Inject
    private Notifications notifications;

    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (broughtDateField.getValue() != null && takenDateField.getValue().compareTo(broughtDateField.getValue()) == 1) {
            notifications.create()
                    .withCaption("The taken date is ahead of the brought date!")
                    .show();
            event.preventCommit();
        }
        if (!bookField.getValue().getLibrary().getName().equals(employeeField.getValue().getLibrary().getName())) {
            notifications.create()
                    .withCaption("The library of the book and the employee's library aren't the same!")
                    .show();
            event.preventCommit();
        }
        bookField.getValue().setIsTaken(true);
        dataManager.commit(bookField.getValue());
    }

    /*@Subscribe
    public void onInit(InitEvent event, Map<String, Object> params) {
        Boolean isTaken = false;
        PickerField.LookupAction action = bookField.getActionNN("lookup");
        action.setLookupScreenParams("isTaken", isTaken);
    }

     */
}