package com.test.spring.controller;

import com.test.spring.entity.Regiao;
import com.test.spring.repository.RegiaoRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegiaoController {
    private final RegiaoRepo repository;

    public RegiaoController(RegiaoRepo repository){
        this.repository = repository;
    }

    @GetMapping("/regiao")
    public List<Regiao> getRegiao(){
        return repository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id){
        Optional regiaoEscolhidaOptional = repository.findById(id);
        if (regiaoEscolhidaOptional.isPresent()){
            Object regiaoEscolhida = regiaoEscolhidaOptional.get();
            return new ResponseEntity<>(regiaoEscolhida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/regiao/novo")
    public Regiao putRegiao(@RequestBody Regiao newRegiao){
        return repository.save(newRegiao);
    }

    @DeleteMapping("/regiao/delete/{id}")
    public void  deleteRegiao(@PathVariable Long id){
        repository.deleteById(id);
    }
}
