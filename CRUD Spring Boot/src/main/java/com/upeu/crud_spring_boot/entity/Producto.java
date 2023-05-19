package com.upeu.crud_spring_boot.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer proid;
    private String proname;
    private Double proprecio;
    private int prostock;
    
    @ManyToOne
    @JoinColumn(name="idCat")
    private Categoria categoria;
}
