package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Table(name = "LIB_BOOK")
@Entity(name = "lib_Book")
@NamePattern("%s %s : %s|name,author,amount")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -8146601096783026024L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    @PositiveOrZero
    private Integer amount;

    @JoinTable(name = "LIB_BOOK_LIBRARY_LINK",
            joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "LIBRARY_ID"))
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToMany
    private List<Library> library;

    public List<Library> getLibrary() {
        return library;
    }

    public void setLibrary(List<Library> library) {
        this.library = library;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}