package com.upeu.crud_spring_boot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.crud_spring_boot.entity.Categoria;
import com.upeu.crud_spring_boot.repository.CategoriaRepository;
import com.upeu.crud_spring_boot.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;
        
    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }
    
    @Override
    public Categoria guardar(Categoria categoria) {
       return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
       return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        categoriaRepository.deleteById(id);
    }
    
}
