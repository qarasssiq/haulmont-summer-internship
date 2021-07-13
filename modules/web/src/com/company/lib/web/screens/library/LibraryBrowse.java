package com.company.lib.web.screens.library;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Library;

import javax.inject.Inject;

@UiController("lib_Library.browse")
@UiDescriptor("library-browse.xml")
@LookupComponent("librariesTable")
@LoadDataBeforeShow
public class LibraryBrowse extends StandardLookup<Library> {

}