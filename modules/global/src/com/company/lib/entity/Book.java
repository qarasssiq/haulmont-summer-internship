package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Table(name = "LIB_BOOK")
@Entity(name = "lib_Book")
@NamePattern("%s|name")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -8146601096783026024L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BOOK_CARD_ID")
    private BookCard bookCard;

    @NotNull
    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    @PositiveOrZero
    private Integer amount;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIBRARY_ID")
    private Library library;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "READER_CARD_ID")
    private ReaderCard readerCard;

    public ReaderCard getReaderCard() {
        return readerCard;
    }

    public void setReaderCard(ReaderCard readerCard) {
        this.readerCard = readerCard;
    }

    public BookCard getBookCard() {
        return bookCard;
    }

    public void setBookCard(BookCard bookCard) {
        this.bookCard = bookCard;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
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