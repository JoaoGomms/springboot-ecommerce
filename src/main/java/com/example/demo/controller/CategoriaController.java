package com.example.demo.controller;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> list(){
        return categoriaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Categoria get(@PathVariable Long id) {
        return categoriaRepository.getOne(id);
    }

    @PostMapping()
    public Categoria create(@Valid @RequestBody Categoria categoria) {
        categoria.setId(0L);
        return categoriaRepository.save(categoria);
    }
}
