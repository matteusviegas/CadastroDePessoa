package dev.java.CadastroDePessoa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping

public class AplicationController {
    @GetMapping("/hello")
    public String BoasVindas(){
    return "Olá, sejam bem vindos!";
    }


}
