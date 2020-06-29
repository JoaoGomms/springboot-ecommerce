package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Carrinho implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    @JoinColumn
    private List<Produto> produtos;

    @ManyToOne
    private Pagamento pagamento;

    private double valorTotal;

    Produto produto = new Produto();

    public double getValorTotal() {
        for (int i = 0; i > produtos.size(); i++) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }


    public Long getId() {
        return id;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
