package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.usuario;

public interface UsuarioRepositorio extends JpaRepository<usuario,String> {
    
}
