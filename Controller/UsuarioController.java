package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.usuario;
import com.example.demo.Repository.UsuarioRepositorio;


import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;




@RestController
@AllArgsConstructor
public class UsuarioController {

    @Autowired
    //private UsuarioService service;

    UsuarioRepositorio repository;

    @GetMapping("/Usuario")
    public List<usuario> getAllUsuarios(){
        return repository.findAll();

    }
    @GetMapping("/Usuario/{id_usuario}")
    public usuario getusuarioById(@PathVariable String id_usuario){

             return repository.findById(id_usuario).get();

        }

    @PostMapping("/Usuario")
    public usuario saveUsuario(@RequestBody usuario Usuario) {
        return repository.save(Usuario);

    }

    @DeleteMapping("/Usuario/{id_usuario}")
    public void deleteUsuario(@PathVariable String id_usuario){
         repository.deleteById(id_usuario);
    }

   @PutMapping("/Usuario/{id_usuario}")
    public Optional<usuario> atualizaUsuario (@RequestBody usuario Usuario){
        repository.save(Usuario);
        return repository.findById(Usuario.getId_usuario());



  }

    

}

   










    

    



    

