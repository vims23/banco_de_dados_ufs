package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.rota;
import com.example.demo.Repository.RotaRepositorio;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class RotaController {

    @Autowired
    //private UsuarioService service;

    RotaRepositorio repository;

    @GetMapping("/Rota")
    public List<rota> getAllRotas(){
        return repository.findAll();

    }
    @GetMapping("/Rota/{id_rota}")
    public rota getcartaoById(@PathVariable String id_linha){

             return repository.findById(id_linha).get();

        }

    @PostMapping("/Rota")
    public rota saveRota(@RequestBody rota Rota) {
        return repository.save(Rota);

    }

    @DeleteMapping("/Rota/{id_linha}")
    public void deleteRota(@PathVariable String id_linha){
         repository.deleteById(id_linha);
    }

   @PutMapping("/Rota/{id_linha}")
    public Optional<rota> atualizaRota (@RequestBody rota Rota){
        repository.save(Rota);
        return repository.findById(Rota.getId_linha());



  }
    
}
