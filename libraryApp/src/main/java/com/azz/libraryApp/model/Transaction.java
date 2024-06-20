package com.azz.libraryApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Long idmember;
    private Long idbook;
    private int status;


    public Long getId() {
        return id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getIdmember() {
        return idmember;
    }

    public void setIdmember(Long idmember) {
        this.idmember = idmember;
    }

    public Long getIdbook() {
        return idbook;
    }

    public void setIdbook(Long idbook) {
        this.idbook = idbook;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
