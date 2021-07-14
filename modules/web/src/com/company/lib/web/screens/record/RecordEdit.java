package com.company.lib.web.screens.record;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Record;

@UiController("lib_Record.edit")
@UiDescriptor("record-edit.xml")
@EditedEntityContainer("recordDc")
@LoadDataBeforeShow
public class RecordEdit extends StandardEditor<Record> {
}