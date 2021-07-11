package com.company.lib.web.screens.form;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Form;

@UiController("lib_Form.edit")
@UiDescriptor("form-edit.xml")
@EditedEntityContainer("formDc")
@LoadDataBeforeShow
public class FormEdit extends StandardEditor<Form> {
}