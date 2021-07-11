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

@Table(name = "LIB_READER_CARD")
@Entity(name = "lib_ReaderCard")
@NamePattern("%s|reader")
public class ReaderCard extends StandardEntity {
    private static final long serialVersionUID = -5157817310807669731L;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "READER_ID")
    private Reader reader;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "readerCard")
    private List<Book> book;

    @NotNull
    @Column(name = "TAKEN_DATE", nullable = false)
    private LocalDate takenDate;

    @Column(name = "BROUGHT_DATE")
    private LocalDate broughtDate;

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

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}