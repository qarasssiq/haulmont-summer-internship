package com.company.lib.web.screens.reader;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Reader;

@UiController("lib_Reader.browse")
@UiDescriptor("reader-browse.xml")
@LookupComponent("readersTable")
@LoadDataBeforeShow
public class ReaderBrowse extends StandardLookup<Reader> {
}