package com.company.lib.web.screens.library;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Library;

@UiController("lib_Library.browse")
@UiDescriptor("library-browse.xml")
@LookupComponent("librariesTable")
@LoadDataBeforeShow
public class LibraryBrowse extends StandardLookup<Library> {
}