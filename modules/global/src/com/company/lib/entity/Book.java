package com.company.lib.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Table(name = "LIB_BOOK")
@Entity(name = "lib_Book")
@NamePattern("%s %s|name,author")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -8146601096783026024L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "book")
    private List<Record> records;

    @NotNull
    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "AMOUNT")
    @PositiveOrZero
    private Integer amount;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "LIBRARY_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Library library;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
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