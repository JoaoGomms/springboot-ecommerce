package com.example.demo.controller;

import com.example.demo.entity.Pagamento;
import com.example.demo.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;


    @GetMapping
    public List<Pagamento> list(){ return pagamentoRepository.findAll();}

    @PostMapping
    public Pagamento create(@RequestBody Pagamento pagamento){
        pagamento.setId(0L);
        return pagamentoRepository.save(pagamento);
    }


}
