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
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @JoinTable(name = "LIB_BOOK_LIBRARY_LINK",
            joinColumns = @JoinColumn(name = "LIBRARY_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}