package com.example.demo.controller;

import com.example.demo.model.Consulta;
import com.example.demo.model.Profissional;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Paciente;
@RestController
@RequestMapping("api/v1/cadastrar")
public class CadastrarController {

    @PostMapping("/pacientes")
    public String paciente (@RequestBody Paciente paciente) {
        System.out.println(paciente);
        //System.out.println(paciente.getTitulo()); //pega so o titulo
        return "Paciente cadastrado com sucesso!";
    }

    @PostMapping("/profissionais")
    public String profissional(@RequestBody Profissional profissional) {
        System.out.println(profissional);
        //System.out.println(paciente.getTitulo()); //pega so o titulo
        return "Profissional cadastrado com sucesso!";
    }

    @PostMapping("/consulta")
    public String consulta(@RequestBody Consulta consulta) {
        System.out.println(consulta);
        //System.out.println(paciente.getTitulo()); //pega so o titulo
        return "Consulta cadastrada com sucesso!";
    }
    //@GetMapping
    //public Paciente getGame() {
    //    return new Paciente(100, "BetleToads", 1987);
    //}
}
