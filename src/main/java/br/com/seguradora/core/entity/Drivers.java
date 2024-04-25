package br.com.seguradora.core.entity;

import java.time.LocalDate;


public class Drivers {

    private Long id;
    private String document;
    private LocalDate birthdate;


    public Drivers(Long id, String document, LocalDate birthdate) {
        this.id = id;
        this.document = document;
        this.birthdate = birthdate;
    }

    public Drivers(String document, LocalDate birthdate) {
        this.document = document;
        this.birthdate = birthdate;
    }

    public Drivers() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
