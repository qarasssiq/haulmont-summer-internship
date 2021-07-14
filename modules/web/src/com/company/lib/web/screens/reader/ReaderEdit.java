package com.company.lib.web.screens.reader;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Reader;

@UiController("lib_Reader.edit")
@UiDescriptor("reader-edit.xml")
@EditedEntityContainer("readerDc")
@LoadDataBeforeShow
public class ReaderEdit extends StandardEditor<Reader> {
}