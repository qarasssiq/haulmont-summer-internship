package com.company.lib.web.screens.form;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Form;

@UiController("lib_Form.browse")
@UiDescriptor("form-browse.xml")
@LookupComponent("formsTable")
@LoadDataBeforeShow
public class FormBrowse extends StandardLookup<Form> {
}