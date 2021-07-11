package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIB_READER")
@Entity(name = "lib_Reader")
@NamePattern("%s %s %s|lastName,firstName,middleName")
public class Reader extends StandardEntity {
    private static final long serialVersionUID = -5339170334777031872L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "MIDDLE_NAME", nullable = false)
    private String middleName;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_CARD_ID")
    private BookCard bookCard;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "reader", optional = false)
    private ReaderCard readerCard;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToMany
    @JoinTable(name = "LIB_READER_LIBRARY_LINK",
            joinColumns = @JoinColumn(name = "READER_ID"),
            inverseJoinColumns = @JoinColumn(name = "LIBRARY_ID"))
    private List<Library> library;

    public void setLibrary(List<Library> library) {
        this.library = library;
    }

    public List<Library> getLibrary() {
        return library;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}