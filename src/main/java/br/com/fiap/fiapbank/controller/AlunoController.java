package br.com.fiap.fiapbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.fiapbank.service.AlunoService;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public @ResponseBody ResponseEntity<?> listar() {
        return ResponseEntity.ok().body(alunoService.findAll());
    }
    
}
