package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Table(name = "LIB_BOOK_CARD")
@Entity(name = "lib_BookCard")
@NamePattern("%s|book")
public class BookCard extends StandardEntity {
    private static final long serialVersionUID = -3486214230083929296L;

    @NotNull
    @Column(name = "TAKEN_DATE", nullable = false)
    private LocalDate takenDate;

    @Column(name = "BROUGHT_DATE")
    private LocalDate broughtDate;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "bookCard")
    private List<Reader> readers;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "bookCard", optional = false)
    private Book book;

    @JoinTable(name = "LIB_EMPLOYEE_BOOK_CARD_LINK",
            joinColumns = @JoinColumn(name = "BOOK_CARD_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToMany
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
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
}