package com.upeu.catalogo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping 
public class SaludoController {
    @GetMapping()
    public String list(){
        return "hola";
    }
}
