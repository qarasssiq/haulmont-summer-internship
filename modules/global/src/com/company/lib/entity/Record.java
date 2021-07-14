package com.company.lib.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "LIB_RECORD")
@Entity(name = "lib_Record")
public class Record extends StandardEntity {
    private static final long serialVersionUID = 6739054957376937833L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "READER_ID")
    private Reader reader;

    @Column(name = "LIBRARY")
    private String library;

    @NotNull
    @Column(name = "TAKEN_DATE", nullable = false)
    private LocalDate takenDate;

    @Column(name = "BROUGHT_DATE")
    private LocalDate broughtDate;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public String getLibrary() {
        return library;
    }

    public LocalDate getBroughtDate() {
        return broughtDate;
    }

    public void setBroughtDate(LocalDate broughtDate) {
        this.broughtDate = broughtDate;
    }

    public LocalDate getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(LocalDate takenDate) {
        this.takenDate = takenDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}