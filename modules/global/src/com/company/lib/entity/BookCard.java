package com.company.lib.entity;

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
public class BookCard extends StandardEntity {
    private static final long serialVersionUID = -3486214230083929296L;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @NotNull
    @Column(name = "TAKEN_DATE", nullable = false)
    private LocalDate takenDate;

    @Column(name = "BROUGHT_DATE")
    private LocalDate broughtDate;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "bookCard")
    private List<Employee> employee;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "bookCard")
    private List<Reader> reader;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
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

    public List<Reader> getReader() {
        return reader;
    }

    public void setReader(List<Reader> reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}