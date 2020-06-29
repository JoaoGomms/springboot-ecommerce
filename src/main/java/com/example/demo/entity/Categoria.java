package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.internal.instrumentation.InstrumentationTarget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categoria implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String Categoria;

    public Categoria() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
