package dev.java10x.CadastroDeNinja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {


    @GetMapping("/boasvindas") //PEGAR informaçoes
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
