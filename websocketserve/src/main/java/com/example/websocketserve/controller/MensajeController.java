package com.example.websocketserve.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.websocketserve.model.Mensaje;

@Controller
public class MensajeController {
    @MessageMapping("/saludo")  //desde donde
    @SendTo("/destino/mensaje") // destino (a donde)
    public Mensaje saludo(Mensaje mensaje) throws Exception{
        Thread.sleep(100); //retarso simulado
        return mensaje;
    }
}
