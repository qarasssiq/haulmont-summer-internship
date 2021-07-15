package com.company.lib.web.screens.library;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Library;

@UiController("lib_Library.edit")
@UiDescriptor("library-edit.xml")
@EditedEntityContainer("libraryDc")
@LoadDataBeforeShow
public class LibraryEdit extends StandardEditor<Library> {
}