package com.company.lib.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Employee;

@UiController("lib_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}