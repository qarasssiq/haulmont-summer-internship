package com.company.lib.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.lib.entity.Employee;

@UiController("lib_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}