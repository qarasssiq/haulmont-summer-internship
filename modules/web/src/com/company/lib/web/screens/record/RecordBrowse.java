package com.company.lib.web.screens.record;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Record;

@UiController("lib_Record.browse")
@UiDescriptor("record-browse.xml")
@LookupComponent("recordsTable")
@LoadDataBeforeShow
public class RecordBrowse extends StandardLookup<Record> {
}