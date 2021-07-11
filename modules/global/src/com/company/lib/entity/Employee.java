package com.company.lib.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIB_EMPLOYEE")
@Entity(name = "lib_Employee")
@NamePattern("%s %s %s|lastName,firstName,middleName")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -1551357803327911138L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "MIDDLE_NAME", nullable = false)
    private String middleName;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LIBRARY_ID")
    private Library library;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    @JoinTable(name = "LIB_EMPLOYEE_BOOK_CARD_LINK",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_CARD_ID"))
    private List<BookCard> bookCard;

    public void setBookCard(List<BookCard> bookCard) {
        this.bookCard = bookCard;
    }

    public List<BookCard> getBookCard() {
        return bookCard;
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

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

}