package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated
    public TipoPagamento tipo;

    private Double valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
