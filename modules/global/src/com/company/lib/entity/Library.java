package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIB_LIBRARY")
@Entity(name = "lib_Library")
@NamePattern("%s|name")
public class Library extends StandardEntity {
    private static final long serialVersionUID = -8201068562875002155L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "library")
    private List<Employee> employees;

    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "library")
    private List<Book> books;

    @JoinTable(name = "LIB_READER_LIBRARY_LINK",
            joinColumns = @JoinColumn(name = "LIBRARY_ID"),
            inverseJoinColumns = @JoinColumn(name = "READER_ID"))
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    private List<Reader> readers;

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}