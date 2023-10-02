package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.cartao;
import com.example.demo.Repository.CartaoRepositorio;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
public class CartaoController {


    @Autowired
    //private UsuarioService service;

    CartaoRepositorio repository;

    @GetMapping("/Cartao")
    public List<cartao> getAllCartoes(){
        return repository.findAll();

    }
    @GetMapping("/Cartao/{id_cartao}")
    public cartao getcartaoById(@PathVariable String id_cartao){

             return repository.findById(id_cartao).get();

        }

    @PostMapping("/Cartao")
    public cartao saveCartao(@RequestBody cartao Cartao) {
        return repository.save(Cartao);

    }

    @DeleteMapping("/Cartao/{id_cartao}")
    public void deleteCartao(@PathVariable String id_cartao){
         repository.deleteById(id_cartao);
    }

   @PutMapping("/Cartao/{id_cartao}")
    public Optional<cartao> atualizaCartao (@RequestBody cartao Cartao){
        repository.save(Cartao);
        return repository.findById(Cartao.getId_cartao());



  }


    
}
