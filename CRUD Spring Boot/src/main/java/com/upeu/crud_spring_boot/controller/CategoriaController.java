package com.upeu.crud_spring_boot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.crud_spring_boot.entity.Categoria;
import com.upeu.crud_spring_boot.service.CategoriaService;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public List<Categoria> listar(){
        return categoriaService.listar();
    }

    @PostMapping()
    public Categoria guardar(@RequestBody Categoria categoria){
        return categoriaService.guardar(categoria);
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable(required = true)Integer id){
        return categoriaService.listarPorId(id).get();
    }

    @PutMapping()
    public Categoria actualizar(@RequestBody Categoria categoria){
        return categoriaService.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true)Integer id){
        categoriaService.eliminarPorId(id);
    }
}
